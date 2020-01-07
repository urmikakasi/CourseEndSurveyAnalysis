package javadbms;

import javax.swing.*;
public class viewpage {
	viewpage(String check)
	{
		if(check.equals("faculty")) 
		{
			JFrame f=new JFrame("View Faculty");  
		    JLabel f_h;
		    f_h=new JLabel("Current Faculty: ");  
		    f_h.setBounds(180,30,150,30);
		    f.add(f_h);
		    DbConnection d= new DbConnection();
		    String[] result=new String[10];
		    result= d.select("select * from faculty");
		    int y=50;
		    for(int i=0;i<result.length;i++)
		    {
		    	JLabel data;
		    	data= new JLabel(result[i]);
		    	data.setBounds(180,y,300,30);
		    	y=y+50;
		    	f.add(data);
		    	f.setSize(450,500);  
		        f.setLayout(null);  
		        f.setVisible(true);
		    }
		}
		    
		if(check.equals("courses"))
		{
			JFrame f1=new JFrame("View Courses");  
		    
		    JLabel f_h=new JLabel("Current Courses: ");  
		    f_h.setBounds(180,30,150,30);
		    f1.add(f_h);
		    DbConnection d= new DbConnection();
		    String result[]=new String[10];
		    result= d.select("select * from course");
		    int y=50;
		    
		    		    
		    
		    for(int i=0;i<result.length;i++)
		    {
		    	JLabel data;
		    	data= new JLabel(result[i]);
		    	data.setBounds(180,y,400,30);
		    	y=y+50;
		    	f1.add(data);
		    	f1.setSize(650,500);  
		        f1.setLayout(null);  
		        f1.setVisible(true);
		    }
		}
	    
		    if(check.equals("assignedcourses"))
		    {
		    	JFrame f1=new JFrame("Assigned Courses");  
			    
			    JLabel f_h=new JLabel("Current Courses: ");  
			    f_h.setBounds(180,30,150,30);
			    f1.add(f_h);
			    DbConnection d= new DbConnection();
			    String result[]=new String[10];
			    result= d.select("select * from course_assign");
			    int y=50;
			    
			    		    
			    
			    for(int i=0;i<result.length;i++)
			    {
			    	JLabel data;
			    	data= new JLabel(result[i]);
			    	data.setBounds(180,y,400,30);
			    	y=y+50;
			    	f1.add(data);
			    	f1.setSize(450,500);  
			        f1.setLayout(null);  
			        f1.setVisible(true);
		    	
		    	
		    	
			    }
	    
		    }
	}
}
	    
