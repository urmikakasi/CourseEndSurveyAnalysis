package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class faculty_page1 {  
	faculty_page1(){  

    JFrame f=new JFrame("Faculty page1");  
    JLabel f_h;
    f_h=new JLabel("Faculty");  
    f_h.setBounds(100,30,100,30); 

    JLabel f_id1;
    f_id1=new JLabel("Faculty ID :");  
    f_id1.setBounds(50,80, 100,30); 
    JTextField f_id2;
    f_id2=new JTextField();  
    f_id2.setBounds(150,80,100,30);
    
    JLabel f_pass1;
    f_pass1=new JLabel("Password:");  
    f_pass1.setBounds(50,120, 100,30); 
    JPasswordField f_passwordField; 
    f_passwordField = new JPasswordField();
	 f_passwordField.setBounds(150, 120, 100, 30);       
    JButton b1=new JButton("Submit"); 
    
    b1.setBounds(50,200,95,30); 
    f.add(f_h);
    f.add(f_id1);
    f.add(f_id2);
    f.add(f_pass1);
    f.add(f_passwordField);
    f.add(b1);
    f.setSize(450,500);  
    f.setLayout(null);  
    f.setVisible(true);
    
    
    b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String id = f_id2.getText();
			@SuppressWarnings("deprecation")
			String pass= f_passwordField.getText();
			//System.out.println("entered pass: "+pass);
			//retrieve pass from given id
			//if id not found - wrong id
			//if pass not correct - wrong pass
			DbConnection d= new DbConnection();
			boolean pass1=d.fac_validate(id,pass);
			
			//System.out.println("db pass : "+pass1);
			
			if(pass1)
			{
				JOptionPane.showMessageDialog(f, "LOGIN SUCESSFULL");
					@SuppressWarnings("unused")
					faculty_page2 o = new faculty_page2(id);
	    			
	    		
			}
			else {
				JOptionPane.showMessageDialog(f, "ID or Password incorrect");
			}
			
	
		}});  
    }
}