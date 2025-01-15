package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpThree extends JFrame implements ActionListener{

	JRadioButton r1, r2 ,r3 ,r4;
	JCheckBox c1, c2, c3, c4, c5 , c6 , c7;
	JButton submit , cancel;
	String formno ;

	public SignUpThree(String form)  {
		this.formno = form;

		setLayout(null);

		JLabel l1 = new JLabel("Page  3 : Account Details");
		l1.setFont(new Font("Raelway" , Font.BOLD , 22));
		l1.setBounds(280 ,  40 , 400 , 40);
		add(l1);

		JLabel type = new JLabel("Account Type : ");
		type.setFont(new Font("Raelway" , Font.BOLD , 22));
		type.setBounds( 100,  140 , 200 , 30);
		add(type);



		r1 = new JRadioButton("Saving Account ");
		r1.setFont(new Font("Railway" , Font.BOLD , 16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100 , 180, 150 ,20);
		add(r1);


		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Railway" , Font.BOLD , 16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350 , 180, 250 ,20);
		add(r2);


		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Railway" , Font.BOLD , 16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100 , 220, 250 ,20);
		add(r3);

		r4 = new JRadioButton("Reccuring Deposit Account");
		r4.setFont(new Font("Railway" , Font.BOLD , 16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350 , 220, 250 ,20);
		add(r4);

		ButtonGroup groupButton = new ButtonGroup();
		groupButton.add(r1);
		groupButton.add(r2);
		groupButton.add(r3);
		groupButton.add(r4);


		JLabel card = new JLabel("Card & Number ");
		card.setFont(new Font("Raelway" , Font.BOLD , 22));
		card.setBounds( 100,  300 , 200 , 30);
		add(card);


		JLabel number = new JLabel(" XXXX-XXXX-XXXX-4198");
		number.setFont(new Font("Raelway" , Font.BOLD , 22));
		number.setBounds( 330,  300 , 300 , 30);
		add(number);


		JLabel carddetail = new JLabel(" Yours 16 Digit Card Number");
		carddetail.setFont(new Font("Raelway" , Font.BOLD , 12));
		carddetail.setBounds( 100,  330 , 300 , 20);
		add(carddetail);

		JLabel pin = new JLabel("PIN  : ");
		pin.setFont(new Font("Raelway" , Font.BOLD , 22));
		pin.setBounds( 100,  370 , 200 , 30);
		add(pin);



		JLabel pnumber = new JLabel("XXXX");
		pnumber.setFont(new Font("Raelway" , Font.BOLD , 22));
		pnumber.setBounds( 330,  370 , 200 , 30);
		add(pnumber);

		JLabel pindetail = new JLabel(" Yours 4 Digit PIN ");
		pindetail.setFont(new Font("Raelway" , Font.BOLD , 12));
		pindetail.setBounds( 100,  400 , 300 , 20);
		add(pindetail);

		JLabel services = new JLabel("Services Required :");
		services.setFont(new Font("Raelway" , Font.BOLD ,22 ));
		services.setBounds( 100,  450 , 400 , 30);
		add(services);


		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Railway" , Font.BOLD, 14));
		c1.setBounds(100  , 500 ,200 ,30);
		add(c1);



		c2 = new JCheckBox("Internet Banking ");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Railway" , Font.BOLD, 14));
		c2.setBounds(350  , 500 ,200 ,30);
		add(c2);



		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Railway" , Font.BOLD, 14));
		c3.setBounds(100  , 550 ,200 ,30);
		add(c3);



		c4 = new JCheckBox("Email & SMS Alerts ");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Railway" , Font.BOLD, 14));
		c4.setBounds(350 , 550 ,200 ,30);
		add(c4);



		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Railway" , Font.BOLD, 14));
		c5.setBounds(100  , 600 ,200 ,30);
		add(c5);



		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Railway" , Font.BOLD, 14));
		c6.setBounds(350  , 600 ,200 ,30);
		add(c6);



		c7 = new JCheckBox("I hereby declares that the above enterd details are correct to the best of my knowledge  ");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Railway" , Font.BOLD, 12));
		c7.setBounds(100  , 680 ,600 ,30);
		add(c7);


		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Railway" , Font.BOLD, 12));
		submit.setBounds(250  , 720 ,100 ,30);
		submit.addActionListener(this);
		add(submit);


		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Railway" , Font.BOLD, 12));
		cancel.setBounds(420  , 720 ,100 ,30);
		cancel.addActionListener(this);
		add(cancel);



		setSize(850,820);
		getContentPane().setBackground(Color.white);
		setLocation(350, 0);
		setVisible(true);


	}


	public static void main(String[] args) {
		new SignUpThree("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == submit){
			String  accountType = null ;
			if(r1.isSelected()) {
				accountType = "Savings Account"; 
			}
			else if(r2.isSelected()) {
				accountType = "Fixed Deposit Account";
			}
			else if(r3.isSelected()) {
				accountType = "Current Acount ";
			}
			else if(r4.isSelected()) {
				accountType = "Reccuring Deposit Acount ";
			}


			Random random = new Random();
			String cardnumber = "" + Math.abs( (random.nextLong() % 90000000L) + 5040936000000000L);


			String pinnumber = "" + Math.abs( (random.nextLong() % 9000L) + 1000L);

			String facility = "";

			if(c1.isSelected()) {
				facility = facility + "ATM card"; 

			}else  if(c2.isSelected()) {
				facility = facility + "Internet Banking "; 

			}else  if(c3.isSelected()) {
				facility = facility + "Mobile banking "; 

			}else  if(c4.isSelected()) {
				facility = facility + "Email & SMS Alerts "; 

			}else if(c5.isSelected()) {
				facility = facility + "Cheque Book "; 

			}else if(c6.isSelected()) {
				facility = facility + "E-Statement"; 

			}


			try {
				if (accountType == null || accountType.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please select an account type.");
					return;
				}
				else { 
					Conn conn = new Conn();
					String query1 = "insert into signupthree (formno, accountType, cardnumber, pinnumber, facility) values ('" 
							+ formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
					conn.s.executeUpdate(query1);

					String query2 = "insert into login (formno, cardnumber, pin) values ('" 
							+ formno + "', '" + cardnumber + "', '" + pinnumber + "')";
					conn.s.executeUpdate(query2);


					JOptionPane.showMessageDialog(null, "Account Created Successfully!\nCard Number: " 
							+ cardnumber + "\nPIN: " + pinnumber);

					setVisible(false);
					new Deposit(pinnumber).setVisible(false);;

				}
			} catch (Exception e2) {
				System.out.println(e2);
				e2.printStackTrace();

			}


		}else if(e.getSource() == cancel) {
           setVisible(false);
           new Login().setVisible(true);   
           
		}

	}
}
