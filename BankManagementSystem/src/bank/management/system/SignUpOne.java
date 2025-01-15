package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener {

	
	JTextField nameTextField  , fnameTextField, emailTextField , dobTextField  ,addresTextField, cityTextField ,  pincodeTextField ,stateTextField ;
	JRadioButton male , female , other , married , unmarried;
	Random ran = new Random();
	long random =  Math.abs((ran.nextLong() % 9000L) +1000L);
	
	String first = "" + Math.abs(random);
	

	JDateChooser dateChooser;
	
	public SignUpOne() {

		setLayout(null);
		//		All labels here
		
		JLabel formno = new JLabel("Application form no : " + first);
		formno.setFont(new Font("Raleway" , Font.BOLD , 38));
		formno.setBounds(140 , 20 ,600 ,40);
		add(formno);
		
		
		JLabel personDetails = new JLabel("Page 1 :  ");
		personDetails.setFont(new Font("Raleway" , Font.BOLD , 20));
		personDetails.setBounds(290 , 80 ,400 ,30);
		add(personDetails);
		
		
		JLabel name = new JLabel("Name : ");
		name.setFont(new Font("Raleway" , Font.BOLD , 20));
		name.setBounds(100 , 140 ,100 ,30);
		add(name);
		

		JLabel fname = new JLabel("Father's name :");
		fname.setFont(new Font("Raleway" , Font.BOLD , 20));
		fname.setBounds(100 , 190 ,200 ,30);
		add(fname);
		
		JLabel dob = new JLabel("Date of birth  :");
		dob.setFont(new Font("Raleway" , Font.BOLD , 20));
		dob.setBounds(100 , 240 ,200 ,30);
		add(dob);
		
		
		JLabel gender = new JLabel("Gender : ");
		gender.setFont(new Font("Raleway" , Font.BOLD , 20));
		gender.setBounds(100 , 290 ,200 ,30);
		add(gender);
		
		JLabel email = new JLabel("Email  : ");
		email.setFont(new Font("Raleway" , Font.BOLD , 20));
		email.setBounds(100 , 340 ,200 ,30);
		add(email);
		
		JLabel marital = new JLabel("Maretal Status  : ");
		marital.setFont(new Font("Raleway" , Font.BOLD , 20));
		marital.setBounds(100 , 390 ,200 ,30);
		add(marital);
		

		JLabel addres = new JLabel("Address  :");
		addres.setFont(new Font("Raleway" , Font.BOLD , 20));
		addres.setBounds(100 , 440 ,100 ,30);
		add(addres);
		
		
		JLabel city = new JLabel("City  :");
		city.setFont(new Font("Raleway" , Font.BOLD , 20));
		city.setBounds(100 , 490 ,100 ,30);
		add(city);
		
		JLabel state = new JLabel("State :");
		state.setFont(new Font("Raleway" , Font.BOLD , 20));
		state.setBounds(100 , 540 ,100 ,30);
		add(state);
		
		JLabel pincode = new JLabel("PinCode :");
		pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
		pincode.setBounds(100 , 590 ,100 ,30);
		add(pincode);
		
//		Label declaration Ends Here
		
//		Text fields are declared Here
		
		nameTextField = new  JTextField();
		nameTextField.setFont(new Font("Ralway" ,Font.BOLD, 15));
		nameTextField.setBounds(300 ,140 ,400 ,30 );
		add(nameTextField);
		
		
		fnameTextField = new  JTextField();
		fnameTextField.setFont(new Font("Ralway" ,Font.BOLD, 15));
		fnameTextField.setBounds(300 ,190 ,400 ,30 );
		add(fnameTextField);


	    dateChooser = new JDateChooser();
		dateChooser.setBounds(300 , 240 ,400 ,30);
		dateChooser.setForeground(Color.BLACK);
		add(dateChooser);
		
//		JTextField genderTextfield = new  JTextField();

		
	    male = new JRadioButton("Male");
		male.setBounds(300 ,290 ,60 ,30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450 ,290 ,120 ,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		
	    emailTextField = new  JTextField();
		emailTextField.setFont(new Font("Ralway" ,Font.BOLD, 20));
		emailTextField.setBounds(300 ,340 ,400 ,30 );
		add(emailTextField);
		
				
		
//		JTextField maritalTextfield = new  JTextField();

		married = new JRadioButton("Married");
		married .setBounds(300 ,390 ,120 ,30);
		married .setBackground(Color.white);
		add(married );
		
		unmarried  = new JRadioButton("Un Married");
		unmarried .setBounds(450 ,390 ,120 ,30);
		unmarried .setBackground(Color.white);
		add(unmarried );

		other  = new JRadioButton("Other");
		other.setBounds(630 ,390 ,120 ,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		
//		*************************
	
		
		addresTextField = new  JTextField();
		addresTextField.setFont(new Font("Ralway" ,Font.BOLD, 20));
		addresTextField.setBounds(300 ,440 ,400 ,30 );
		add(addresTextField);
		
		
		cityTextField = new  JTextField();
		cityTextField.setFont(new Font("Ralway" ,Font.BOLD, 20));
		cityTextField.setBounds(300 ,490 ,400 ,30 );
		add(cityTextField);

		stateTextField = new  JTextField();
		stateTextField.setFont(new Font("Ralway" ,Font.BOLD, 20));
		stateTextField.setBounds(300 ,540 ,400 ,30 );
		add(stateTextField);


		
		
		pincodeTextField = new  JTextField();
		pincodeTextField.setFont(new Font("Ralway" ,Font.BOLD, 20));
		pincodeTextField.setBounds(300 ,590 ,400 ,30 );
		add(pincodeTextField);
		
		
		
//		****************************************
//		  Buttons
		
		JButton next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Relway" , Font.BOLD , 14));
		next.setBounds(620 , 660 ,80 ,30);
		next.addActionListener(this);
        add(next);
		
		
		
		
		
//		Frame creation 
		getContentPane().setBackground(Color.white);		
		setSize(850 , 800);
		setLocation(300,10);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	   String formno = first;
	   String name = nameTextField.getText();
	   String fname = fnameTextField.getText();
	   String dob = ((JTextField ) dateChooser.getDateEditor().getUiComponent()).getText();
	   String gender =  null;
	   
	   if(male.isSelected()) {
		   gender = "male";
	   }
	   else if (female.isSelected()) {
		   gender  = "female";
		   
	   }
	   
	   String email = emailTextField.getText();
	   String marital = null ;
	   
	   if(married.isSelected()) {
		   marital = " married ";
		   
	   }
	   else if(unmarried.isSelected()) {
		    marital = "un Married";
		   
	   }
	   else if(other.isSelected()) {
		   marital = " other";
		   
	   }
	   
	   String address = addresTextField.getText();
	   String city = cityTextField.getText();
	   String state  = stateTextField.getText();
	   String pin = pincodeTextField.getText();
	   
	   
	   try {
		   
		   if (name.equals("") || fname.equals("") || dob.equals("") || gender == null || email.equals("") || marital == null || address.equals("") || city.equals("") || state.equals("") || pin.equals("")) {
			    JOptionPane.showMessageDialog(null, "All fields are required");
			    return;
			}
		   else {
			Conn c = new Conn();
			String query = "insert into signup values ( '" + formno + "' , '" + name+ "' , '" + fname + "' , '" + dob + "', '" + gender + "', '" + email + "', " +
	                   "'" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";
		
		    c.s.executeUpdate(query);
		    setVisible(false);
		    new SignUpTwo(formno).setVisible(true);
		    
		    
		    
		   
		   }

		   
		   
	   }catch (Exception e1) {
		System.out.println(e1.getMessage());
	}
	   
	   
	   
	}

	
	public static void main(String[] args) {
	new SignUpOne();
}

}
