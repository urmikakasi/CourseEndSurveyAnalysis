package javadbms;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class admin_page1 {  
	admin_page1(){  

    JFrame f=new JFrame("Admin page1");  
    JLabel a_h;
    a_h=new JLabel("Admin");  
    a_h.setBounds(100,30,100,30); 

    JLabel a_id1;
    a_id1=new JLabel("NAME:");  
    a_id1.setBounds(50,80, 100,30); 
    JTextField a_id2;
    a_id2=new JTextField();  
    a_id2.setBounds(150,80,100,30);
    
    JLabel a_pass1;
    a_pass1=new JLabel("Password:");  
    a_pass1.setBounds(50,120, 100,30);
    JPasswordField a_passwordField; 
    a_passwordField = new JPasswordField();
	 a_passwordField.setBounds(150, 120, 100, 30);   
   
    JButton b1=new JButton("Submit"); 
    b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String id = a_id2.getText();
			@SuppressWarnings("deprecation")
			String pass= a_passwordField.getText();
			
			if(id.equals("admin")&& pass.equals("password"))
			{
				//JOptionPane.showMessageDialog(f, "LOGIN SUCCESSFULL");
				
	    			@SuppressWarnings("unused")
					admin_page2 o = new admin_page2();
	    			
	    		
			}
			else {
				JOptionPane.showMessageDialog(f, "ID or Password incorrect");
			}
			
		}
	});
    
    b1.setBounds(50,200,95,30); 
    f.add(a_h);
    f.add(a_id1);
    f.add(a_id2);
    f.add(a_pass1);
    f.add(a_passwordField);
    f.add(b1);
    f.setSize(450,300);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
