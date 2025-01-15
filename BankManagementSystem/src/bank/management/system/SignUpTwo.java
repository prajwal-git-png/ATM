package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUpTwo extends JFrame implements ActionListener {

    long random;
    JTextField panTextField, aadharTextField;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religionComboBox, categoryComboBox, occupationComboBox, educationComboBox, incomeComboBox;
    String formno;
    
    
    public SignUpTwo(String formno) {
    	this.formno = formno;
        setLayout(null);
        

        // All labels here
        setTitle("NEW ACCOUNT APPLICATION : ");

        JLabel additionDetails = new JLabel("Page 2 :Additional Details  ");
        additionDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionDetails.setBounds(290, 80, 400, 30);
        add(additionDetails);

        JLabel religionLabel = new JLabel("Religion");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        JLabel categoryLabel = new JLabel("Category");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        JLabel incomeLabel = new JLabel("Income :");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);

        JLabel qualificationLabel = new JLabel("Qualification :");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(100, 315, 200, 30);
        add(qualificationLabel);

        JLabel occupationLabel = new JLabel("Occupation ");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        JLabel panLabel = new JLabel("PAN Number");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        JLabel aadharLabel = new JLabel("Aadhar Number :");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        JLabel seniorCitizenLabel = new JLabel("Senior Citizen ");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 540, 200, 30);
        add(seniorCitizenLabel);

        JLabel existingAccountLabel = new JLabel("Existing Account");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 590, 200, 30);
        add(existingAccountLabel);

        // Text fields are declared Here
        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.white);
        add(religionComboBox);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.white);
        add(categoryComboBox);

        String[] valIncome = {"null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Up to 10,00,000"};
        incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setBackground(Color.white);
        add(incomeComboBox);

        String[] educationValues = {"Graduate", "Post Graduation", "Doctorate", "Others"};
        educationComboBox = new JComboBox(educationValues);
        educationComboBox.setBounds(300, 290, 400, 30);
        educationComboBox.setBackground(Color.white);
        add(educationComboBox);

        String[] occupationValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.white);
        add(occupationComboBox);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

     

      
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 20));
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 20));
        sno.setBackground(Color.WHITE);
        sno.setBounds(400, 540, 100, 30);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);
        
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 20));
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 20));
        eno.setBackground(Color.WHITE);
        eno.setBounds(400, 590, 100, 30);
        add(eno);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);


        // Buttons
        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        // Frame creation
        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(300, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = this.formno;
        String religion = religionComboBox.getSelectedItem().toString();
        String category = categoryComboBox.getSelectedItem().toString();
        String income = incomeComboBox.getSelectedItem().toString();
        String education = educationComboBox.getSelectedItem().toString();
        String occupation = occupationComboBox.getSelectedItem().toString();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String seniorCitizen = ""; // Add logic for senior citizen
        String existingAccount = ""; // Add logic for existing account
        
        if(syes.isSelected()) {
        	seniorCitizen = "Yes";
        }
        else if(sno.isSelected()) {
        	seniorCitizen = "No";
        }
        
        if(eyes.isSelected()) {
        	existingAccount = "Yes";
        }
        else if (eno.isSelected()) {
        	existingAccount = "No";
        }
        
        
        
        try {
            if (religion.equals("") || category.equals("") || income.equals("") || education.equals("") || occupation.equals("") || pan.equals("") || aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "All fields are required");
                return;
            } else {
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorCitizen, existingAccount) VALUES ('" 
                        + formno + "', '" 
                        + religion + "', '" 
                        + category + "', '" 
                        + income + "', '" 
                        + education + "', '" 
                        + occupation + "', '" 
                        + pan + "', '" 
                        + aadhar + "', '" 
                        + seniorCitizen + "', '" 
                        + existingAccount + "')";

                
                c.s.execute(query);
                
                // Proceed to next signup page...
                setVisible(false);
                new SignUpThree(formno);
            }

        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
    }

    public static void main(String[] args) {
        new SignUpTwo("");
    }
}