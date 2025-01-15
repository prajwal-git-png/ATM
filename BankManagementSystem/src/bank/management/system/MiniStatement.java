package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement  extends JFrame{

	String pinnumber;
	
	public MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
		setLayout(null);


		JLabel mini = new JLabel();
		mini.setBounds(20 ,140 , 400 ,200);
		add(mini);
		
		JLabel bank = new JLabel("INDIAN POST BANK");
		bank.setBounds(150, 20, 200, 20);
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(20, 80, 300, 20);
		add(card);
		
		
		JLabel balance = new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			Conn c = new Conn();
			
			ResultSet rs = c.s.executeQuery("SELECT * FROM LOGIN WHERE pin = '2003'     "  );
			
			while(rs.next()) {
				card.setText("Card Number : " + rs.getString("cardnumber").substring(0,4) +"xxxxxxxx" + rs.getString("cardnumber").substring(12));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Conn c = new Conn();
			int bal = 0;
			ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinnumber+"'  "  );
			while(rs.next()) {
				mini.setText(mini.getText() + "<html>"+ rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount")+"<br>" +"<html>");
				 if (rs.getString("type").equals("Deposit")) {
                     bal += Integer.parseInt(rs.getString("amount"));
                 } else {
                     bal -= Integer.parseInt(rs.getString("amount"));
                 }				
				
			}
			balance.setText("Your Current account balance in Rs " + bal);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
 



		setSize(400 , 600);;
		setLocation(20 , 20);
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MiniStatement("");

	}


}
