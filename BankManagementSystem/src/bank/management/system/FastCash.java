package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener {

    JButton backButton, hundredButton, fiveHundredButton, thousandButton, twoThousandButton, fiveThousandButton, tenThousandButton;
    String pinNumber;

    public FastCash(String pinNumber) throws HeadlessException {
        this.pinNumber = pinNumber;

        setLayout(null);

        ImageIcon atmImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image atmImage = atmImageIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon resizedAtmImage = new ImageIcon(atmImage);
        JLabel backgroundImage = new JLabel(resizedAtmImage);
        backgroundImage.setBounds(0, 0, 900, 900);
        add(backgroundImage);

        JLabel instructionText = new JLabel("SELECT WITHDRAWAL AMOUNT");
        instructionText.setBounds(200, 300, 700, 35);
        instructionText.setForeground(Color.WHITE);
        instructionText.setFont(new Font("System", Font.BOLD, 16));
        backgroundImage.add(instructionText);

        hundredButton = new JButton("Rs 100");
        hundredButton.setBounds(170, 415, 150, 30);
        hundredButton.addActionListener(this);
        backgroundImage.add(hundredButton);

        fiveHundredButton = new JButton("Rs 500");
        fiveHundredButton.setBounds(355, 415, 150, 30);
        fiveHundredButton.addActionListener(this);
        backgroundImage.add(fiveHundredButton);

        thousandButton = new JButton("Rs 1000");
        thousandButton.setBounds(170, 450, 150, 30);
        thousandButton.addActionListener(this);
        backgroundImage.add(thousandButton);

        twoThousandButton = new JButton("Rs 2000");
        twoThousandButton.setBounds(355, 450, 150, 30);
        twoThousandButton.addActionListener(this);
        backgroundImage.add(twoThousandButton);

        fiveThousandButton = new JButton("Rs 5000");
        fiveThousandButton.setBounds(170, 485, 150, 30);
        fiveThousandButton.addActionListener(this);
        backgroundImage.add(fiveThousandButton);

        tenThousandButton = new JButton("Rs 10000");
        tenThousandButton.setBounds(355, 485, 150, 30);
        tenThousandButton.addActionListener(this);
        backgroundImage.add(tenThousandButton);

        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        backgroundImage.add(backButton);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        } else {
            String amount = ((JButton) e.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinNumber + "'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (e.getSource() != backButton && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String query = "INSERT INTO bank VALUES('" + pinNumber + "', '" + date + "', 'Withdrawal', '" + amount + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
