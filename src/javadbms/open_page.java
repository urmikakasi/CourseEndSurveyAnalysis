package javadbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class open_page { 
	void func()
	{
		JFrame f=new JFrame("Display page");    
	    JLabel d_h;
	    d_h=new JLabel("Course End Survey and Analysis");  
	    d_h.setBounds(100,30,200,30);
	    
	    JButton b1=new JButton("Student"); 
	    b1.setBounds(50,100,95,30); 
	    
	    JButton b2=new JButton("Faculty"); 
	    b2.setBounds(170,100,95,30); 

	    JButton b3=new JButton("Admin"); 
	    b3.setBounds(290,100,95,30);
	    
	    f.add(d_h);
	    f.add(b1);
	    f.add(b2);  
	    f.add(b3);
	    f.setSize(450,300);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    class thehandler implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent event)
	    	{
	    		if(event.getSource()==b1)
	    		{
	    			@SuppressWarnings("unused")
					student_page1 o = new student_page1();
	    			
	    		}
	    		
	    		if(event.getSource()==b2)
	    		{
	    			@SuppressWarnings("unused")
	    			faculty_page1 o = new faculty_page1();
	    		}
	    		if(event.getSource()==b3)
	    		{
	    			@SuppressWarnings("unused")
	    			admin_page1 o= new admin_page1();
	    		}
	    	}
	    }
	    
	    thehandler handler= new thehandler();
	    b1.addActionListener(handler);
	    b2.addActionListener(handler);
	    b3.addActionListener(handler);
	    
	    

			
	    }
	    
	
public static void main(String[] args) {  
    JFrame f=new JFrame("Display page");    
    JLabel d_h;
    d_h=new JLabel("Course End Survey and Analysis");  
    d_h.setBounds(100,30,200,30);
    
    JButton b1=new JButton("Student"); 
    b1.setBounds(50,100,95,30); 
    
    JButton b2=new JButton("Faculty"); 
    b2.setBounds(170,100,95,30); 

    JButton b3=new JButton("Admin"); 
    b3.setBounds(290,100,95,30);
    
    f.add(d_h);
    f.add(b1);
    f.add(b2);  
    f.add(b3);
    f.setSize(450,300);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    class thehandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(event.getSource()==b1)
    		{
    			@SuppressWarnings("unused")
				student_page1 o = new student_page1();
    			
    		}
    		
    		if(event.getSource()==b2)
    		{
    			@SuppressWarnings("unused")
    			faculty_page1 o = new faculty_page1();
    		}
    		if(event.getSource()==b3)
    		{
    			@SuppressWarnings("unused")
    			admin_page1 o= new admin_page1();
    		}
    	}
    }
    
    thehandler handler= new thehandler();
    b1.addActionListener(handler);
    b2.addActionListener(handler);
    b3.addActionListener(handler);
    
    

		
    }
    
    
    
}  
