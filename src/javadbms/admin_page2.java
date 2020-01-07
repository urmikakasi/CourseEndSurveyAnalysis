package javadbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class admin_page2 {  
admin_page2(){
    JFrame f=new JFrame("page2");  

    JButton view_courses=new JButton("View Courses"); 
    view_courses.setBounds(50,100,150,30);
    JButton view_faculty=new JButton("View Faculty"); 
    view_faculty.setBounds(220,100,150,30);
    JButton add_course=new JButton("Add course");
    add_course.setBounds(50,150,150,30);
    JButton courses_assigned=new JButton("Courses Assigned");
    courses_assigned.setBounds(220,150,150,30);
    JButton log_out=new JButton("Log out");
    log_out.setBounds(120,200,150,30);
             
    f.add(view_courses);
    f.add(view_faculty);
    f.add(add_course);
    f.add(courses_assigned);
    f.add(log_out);
    
  
    f.setSize(450,500);  
    f.setLayout(null);  
    f.setVisible(true);   
    
    
    
    class thehandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(event.getSource()==view_courses)
    		{
    			@SuppressWarnings("unused")
				viewpage o = new viewpage("courses");
    			
    		}
    		
    		if(event.getSource()==view_faculty)
    		{
    			@SuppressWarnings("unused")
    			viewpage o = new viewpage("faculty");
    		}
    		if(event.getSource()==add_course)
    		{
    			@SuppressWarnings("unused")
    			admin_page5 o= new admin_page5();
    		}
    		if(event.getSource()==courses_assigned)
    		{
    			@SuppressWarnings("unused") 
    			viewpage o = new viewpage("assignedcourses");
    		}
    		if(event.getSource()==log_out) 
    		{
    			@SuppressWarnings("unused")
    			open_page o= new open_page();
    			o.func();
    		}
    	}
    }
    
    thehandler handler= new thehandler();
    view_courses.addActionListener(handler);
    view_faculty.addActionListener(handler);
    add_course.addActionListener(handler);
    courses_assigned.addActionListener(handler);
    log_out.addActionListener(handler);
}  
}  