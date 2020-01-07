package javadbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;  
public class student_page2 {  
	student_page2(String usn) {
    //int newSizeX=400;
    //int newSizeY=600;  
    JFrame f=new JFrame("page2");  

    JButton course1=new JButton("JAVA"); 
    course1.setBounds(50,100,95,30);
    JButton course2=new JButton("DBMS"); 
    course2.setBounds(160,100,95,30);
    JButton course3=new JButton("DCN");
    course3.setBounds(270,100,95,30);
    JButton course4=new JButton("WP");
    course4.setBounds(100,150,95,30);
    JButton course5=new JButton("PYTHON");
    course5.setBounds(210,150,95,30);
    JButton exit=new JButton("EXIT");
    exit.setBounds(160,200,95,30);
         
    f.add(course1);
    f.add(course2);
    f.add(course3);
    f.add(course4);
    f.add(course5);
    f.add(exit);
  
    f.setSize(450,500);  
    f.setLayout(null);  
    f.setVisible(true);
    
    exit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			open_page o= new open_page();
			o.func();
			
		}});
    
    
    course1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String ccode="16IS5DCJAV";
			@SuppressWarnings("unused")
			student_page3 o =new student_page3(usn,ccode);
			
		}});
    
    
    course2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String ccode="16IS5DCDBM";
			@SuppressWarnings("unused")
			student_page3 o =new student_page3(usn,ccode);
			
		}});
    
    course3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String ccode="16IS5DCDCN";
			@SuppressWarnings("unused")
			student_page3 o =new student_page3(usn,ccode);
			
		}});
    
    course4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String ccode="16IS5DCWEP";
			@SuppressWarnings("unused")
			student_page3 o =new student_page3(usn,ccode);
			
		}});
    
    course5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String ccode="16IS5DEPYP";
			@SuppressWarnings("unused")
			student_page3 o =new student_page3(usn,ccode);
			
		}});
    
    
    
    
    
    
}  
} 
