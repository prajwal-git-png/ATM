package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener{

	JButton exit , deposit , withdrawl , ministatement , pinchange , fastcash , balanceenquiry ;
    String pinnumber ;
	
	public Transactions(String pinnumber) throws HeadlessException {
        this.pinnumber = pinnumber;
		
		setLayout(null);


		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
		Image i2 = i1.getImage() .getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds( 0 , 0 ,900,900);
		add(image);

		JLabel text = new JLabel("PLease select your trasaction ");
		//		MOVE TEXT HERE X       Y   W     H   
		text.setBounds(200 , 300 ,700 , 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" , Font.BOLD , 16));
		image.add(text);

		
		
		
		
		deposit = new JButton("Deposit");
		deposit.setBounds(170 , 415 , 150 ,30);
		deposit.addActionListener(this);
		
		image.add(deposit);


		withdrawl = new JButton("withdrawl");
		withdrawl.setBounds(355 , 415 , 150 ,30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);


		fastcash = new JButton("Fastcash");
		fastcash.setBounds(170 , 450 , 150 ,30);
		fastcash.addActionListener(this);
		image.add(fastcash);


		ministatement = new JButton("Mini statement");
		ministatement.setBounds(355 , 450 , 150 ,30);
		ministatement.addActionListener(this);
		image.add(ministatement);

		pinchange = new JButton(" Pinchange");
		pinchange.setBounds(170 , 485 , 150 ,30);
		pinchange.addActionListener(this);
		image.add(pinchange);

		balanceenquiry = new JButton(" Balance Enquiry");
		balanceenquiry.setBounds(355 , 485 , 150 ,30);
		balanceenquiry.addActionListener(this);
		image.add(balanceenquiry);


	    exit = new JButton(" exit");
		exit.setBounds(355 , 520 , 150 ,30);
		exit.addActionListener(this);
		image.add(exit);



		setSize(900 , 900);;
		setLocation(300 , 0);
		setUndecorated(true);
		setVisible(true);
	}













	public static void main(String[] args) {
		new Transactions("");
	}













	@Override
	public void actionPerformed(ActionEvent e) {
 
		if(e.getSource() == exit) {
			System.exit(0);
		}
		else if(e.getSource() == deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}else if(e.getSource()== withdrawl) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
			
		}else if(e.getSource()== fastcash) {
		setVisible(false);
		new FastCash(pinnumber).setVisible(true);
		
		}
		else if(e.getSource()== pinchange) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);

		}
		else if(e.getSource()== balanceenquiry) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);

		}
		else if(e.getSource()== ministatement) {
			
			new MiniStatement(pinnumber).setVisible(true);

		}


	}
}
