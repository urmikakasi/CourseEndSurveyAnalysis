package javadbms;

import javax.swing.*;    
public class admin_page4 {  

admin_page4() {  

    JFrame f=new JFrame("Admin page4");  
    JLabel a_h;
    a_h=new JLabel("Remove Faculty");  
    a_h.setBounds(100,30,100,30); 
  
    JLabel a_id1;
    a_id1=new JLabel("Faculty ID:");  
    a_id1.setBounds(50,80, 100,30); 
    
    JComboBox comboBox = new JComboBox();
	 comboBox.setBounds(150, 85,100,20);
      
    JButton b1=new JButton("Back"); 
    b1.setBounds(30,120,100,30); 
    
    JButton b2=new JButton("REMOVE"); 
    b2.setBounds(150,120,100,30); 

    f.add(a_h);
    f.add(a_id1);
    f.add(comboBox);
    f.add(b1);
    f.add(b2);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  