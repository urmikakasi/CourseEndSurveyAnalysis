
package javadbms;
import javax.swing.*;    
public class admin_page3 {  
	admin_page3() {  

    JFrame f=new JFrame("Admin page3");  
    JLabel a_h;
    a_h=new JLabel("Add Faculty");  
    a_h.setBounds(180,30,100,30); 
    
    JComboBox<Object> comboBox = new JComboBox<Object>();
	 comboBox.setBounds(150, 85,100,20);
 
    JLabel a_id1;
    a_id1=new JLabel("Faculty ID:");  
    a_id1.setBounds(50,80, 100,30); 
    
    JLabel a_pass1;
    a_pass1=new JLabel("Password:");  
    a_pass1.setBounds(50,120, 100,30);
    
    JPasswordField a_passwordField1; 
    a_passwordField1 = new JPasswordField();
	 a_passwordField1.setBounds(180, 120, 100, 20);   
   
    JLabel a_pass2;
    a_pass2=new JLabel(" Confirm Password:");  
    a_pass2.setBounds(50,180,120,30);
    
    JPasswordField a_passwordField2; 
    a_passwordField2 = new JPasswordField();
	 a_passwordField2.setBounds(180, 180, 100, 20);   

    JButton b1=new JButton("RESET"); 
    b1.setBounds(30,250,100,30); 
    
    JButton b2=new JButton("ADD"); 
    b2.setBounds(150,250,100,30); 

    f.add(a_h);
    f.add(a_id1);
    f.add(comboBox);
    f.add(a_pass1);
    f.add(a_passwordField1);
    f.add(a_pass2);
    f.add(a_passwordField2);
    f.add(b1);
    f.add(b2);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  