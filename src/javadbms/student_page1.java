package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;  
public class student_page1 {
	student_page1(){
    JLabel s_name1;     
    JTextField s_name2;
    
    JLabel s_usn1;
    JTextField s_usn2; 
    
    JTextField s_sem2;
   
    
    JButton b1;  
      
        JFrame f= new JFrame();  
       
        s_name1=new JLabel("USN:");  
        s_name1.setBounds(50,50, 100,30);  
        s_name2=new JTextField();  
        s_name2.setBounds(150,50,150,20);
       
 
        s_usn1=new JLabel("PASSWORD:");  
        s_usn1.setBounds(50,100,100,30);  
        s_usn2=new JTextField();  
        s_usn2.setBounds(150,100,150,20);
        
        JLabel s_sem1 = new JLabel("SEM");  
        s_sem1.setBounds(50,150,100,30);  
        s_sem2=new JTextField();  
        s_sem2.setBounds(150,150,150,20);

        
        
        
        b1=new JButton("Next");  
        b1.setBounds(150,300,100,30);      
        
        f.add(s_name1);
        f.add(s_name2);
        
    
         
        f.add(s_usn1);
        f.add(s_usn2);
        
        f.add(b1);  
        f.add(s_sem1);
        //f.add(comboBox);
        f.add(s_sem2);
        
        f.setSize(450,500);  
        f.setLayout(null);  
        f.setVisible(true); 
        class thehandler implements ActionListener
        {
        	public void actionPerformed(ActionEvent event)
        	{
        		if(event.getSource()==b1)
        		{
        			String usn= s_name2.getText();
        			String pass=s_usn2.getText();
        			DbConnection db= new DbConnection();
        			String[] result= new String[50];
        			result=db.select("select * from student");
        			for(int i=0;i<result.length;i++)
        				System.out.println(result[i]);
        			int flag=1;
        			for(int i=0;i<result.length;i++)
        			{
						if(result[i].equals(usn) && usn.equals(pass))
						{
							flag=0;
			    			@SuppressWarnings("unused")
							student_page2 o= new student_page2(usn);
						}
        			}
        			if(flag==0)
        				JOptionPane.showMessageDialog(f, "USN or Password incorrect");
        		}
        	}
        }
        thehandler handler= new thehandler();
        b1.addActionListener(handler);
        
        

}
}
        