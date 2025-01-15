package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	
	JButton login , signup , clear;
	JTextField cardTextField  ;
	JPasswordField pinTextField;
    // Constructor to initialize the Login frame
    public Login() {
        // Setting title and layout for the frame
        setTitle("ATM");
        setLayout(null);
        
        // Adding the ATM logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  // Load the logo image
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);      // Resize the image
        ImageIcon i3 = new ImageIcon(i2);                                              // Create a new ImageIcon with resized image
        JLabel label = new JLabel(i3);                                                 // Add image to a JLabel
        label.setBounds(70, 10, 100, 100);                                             // Set position and size of the label
        add(label);

        // Adding the welcome text
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));                                // Set font style and size
        text.setBounds(200, 40, 400, 40);                                              // Set position and size of the label
        add(text);

        // Adding the "Card No" label and text field
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway", Font.BOLD, 28));                             // Set font style and size
        cardno.setBounds(120, 150, 150, 30);                                           // Set position and size of the label
        add(cardno);

        cardTextField = new JTextField();                                   // Text field to input card number
        cardTextField.setBounds(300, 150, 230, 30);                                    // Set position and size of the text field
        cardTextField.setFont(new Font("Arial" , Font.BOLD , 10));
        add(cardTextField);

        // Adding the "PIN" label and text field
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Railway", Font.BOLD, 28));                                // Set font style and size
        pin.setBounds(120, 220, 250, 30);                                              // Set position and size of the label
        add(pin);

        pinTextField = new JPasswordField();                                    // Text field to input PIN
        pinTextField.setBounds(300, 220, 230, 30);                                     // Set position and size of the text field
        pinTextField.setFont(new Font("Arial" , Font.BOLD , 14));
        add(pinTextField);

        // Adding the "Login" button
        login = new JButton("Login");                                          // Button for login
        login.setBounds(300, 300, 100, 30);                                            // Set position and size of the button
        login.setBackground(Color.BLACK);                                             // Set background color
        login.setForeground(Color.WHITE);          
        login.addActionListener(this);                                                                       // Set text color
        add(login);

        // Adding the "Clear" button
        clear = new JButton("Clear");                                         // Button to clear inputs
        clear.setBounds(430, 300, 100, 30);                                           // Set position and size of the button
        clear.setBackground(Color.BLACK);                                            // Set background color
        clear.setForeground(Color.WHITE);                                            // Set text color
        clear.addActionListener(this);     
        add(clear);

        // Adding the "Sign Up" button
        signup = new JButton("Sign Up");                                      // Button for new user registration
        signup.setBounds(300, 350, 230, 30);                                          // Set position and size of the button
        signup.setBackground(Color.BLACK);                                           // Set background color
        signup.setForeground(Color.WHITE);                                           // Set text color
        signup.addActionListener(this);     
        add(signup);

        // Setting background color for the frame
        getContentPane().setBackground(Color.WHITE);                                  // Set white background for the content pane

        // Setting frame size, visibility, and location
        setSize(800, 500);                                                            // Set the size of the frame
        setVisible(true);                                                             // Make the frame visible
        setLocation(300, 250);                                                        // Set the initial position of the frame
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	
    	if(ae.getSource() == clear) {
    		cardTextField.setText("");
    		pinTextField.setText("");
    	}
    	else if (ae.getSource() == login) {
			Conn conn = new Conn();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			String querry = "Select * from login where cardnumber = '" +cardnumber+"' and pin =  ' " +pinnumber+"'  ";
			try {
				
				ResultSet rs =  conn.s.executeQuery(querry);
				if (rs.next()) {
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
				}
				
			} catch (Exception e) {
				
				System.out.println(e);
			}
		}
    	else if (ae.getSource() == signup) {
			setVisible(false);
			new SignUpOne().setVisible(true);
		}
    	
    }
    // Main method to launch the application
    public static void main(String[] args) {
        new Login();                                                                  // Create an instance of the Login class
    }

}
