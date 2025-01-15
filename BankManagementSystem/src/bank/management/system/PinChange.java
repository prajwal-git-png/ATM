package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PinChange extends JFrame implements ActionListener{

	JButton back ,change ; 
	JPasswordField pin,repin;
	String pinnumber;
	


	public PinChange(String pinnumber) {
		this.pinnumber =pinnumber;
		setLayout(null);

		ImageIcon atmImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image atmImage = atmImageIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon resizedAtmImage = new ImageIcon(atmImage);
		JLabel image = new JLabel(resizedAtmImage);
		image.setBounds(0, 0, 900, 900);
		add(image);

		JLabel instructionText = new JLabel("CHANGE YOU PINT");
		instructionText.setBounds(250, 280, 500, 35);
		instructionText.setForeground(Color.WHITE);
		instructionText.setFont(new Font("System", Font.BOLD, 16));
		image.add(instructionText);

		JLabel text = new JLabel("New PIN");
		text.setBounds( 165, 320 ,180 , 25);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" , Font.BOLD , 16));
		image.add(text);

		JLabel repintext = new JLabel("Re-Enter PIN");
		repintext.setBounds( 165, 360 ,180 , 25);
		repintext.setForeground(Color.WHITE);
		repintext.setFont(new Font("System" , Font.BOLD , 16));
		image.add(repintext);

		pin = new JPasswordField();                                 
		pin.setBounds(330, 320, 180, 25);                               
		pin.setFont(new Font("Raleway" , Font.BOLD , 10));
		image.add(pin);


		repin = new JPasswordField();                                 
		repin.setBounds(330, 360, 180, 25);                               
		repin.setFont(new Font("Raleway" , Font.BOLD , 10));
		image.add(repin);

		change = new JButton(" Pin change");
		change.setBounds(355 , 485 , 150 ,30);
		change.addActionListener(this);
		image.add(change);


		back = new JButton(" Back");
		back.setBounds(355 , 520 , 150 ,30);
		back.addActionListener(this);
		image.add(back);





		setSize(900, 900);
		setLocation(300, 0);
		//     setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PinChange(" ");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == change) {
	        try {
	            String npin = pin.getText();
	            String rpin = repin.getText();

	            if (!npin.equals(rpin)) {
	                JOptionPane.showMessageDialog(null, "Entered PIN does not match.");
	                return;
	            }
	            if (npin.isEmpty() || rpin.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Please enter and re-enter the new PIN.");
	                return;
	            }

	            Conn c = new Conn();

	            // Convert rpin to Integer for INT columns
	            int newPin = Integer.parseInt(rpin);

	            // Correct column names and match data types
	            String query1 = "UPDATE bank SET pin = '" + rpin + "' WHERE pin = '" + pinnumber + "'";
	            String query2 = "UPDATE login SET pin = " + newPin + " WHERE pin = " + pinnumber;
	            String query3 = "UPDATE signupthree SET pinnumber = " + newPin + " WHERE pinnumber = " + pinnumber;

	            c.s.executeUpdate(query1);
	            c.s.executeUpdate(query2);
	            c.s.executeUpdate(query3);

	            JOptionPane.showMessageDialog(null, "PIN changed successfully.");
	            setVisible(false);
	            new Transactions(rpin).setVisible(true);

	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "PIN must be numeric.");
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
	            ex.printStackTrace();
	        }
	    } else {
	        setVisible(false);
	        new Transactions(pinnumber).setVisible(true);
	    }
	}


}
