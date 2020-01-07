package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class student_page3 { 
	String q1,q2,q3,q4,q5,q6,q7;
	void assignQuestion(String ccode)
	{
		switch(ccode)
		{
		case "16IS5DCJAV": q1="Were you able to omprehend the concepts of object oriented programming, packages and applets?";
							q2="Did you find the course challenging and stimulating?";
							q3="Were you able to apply the concepts of encapsulation, inheritance, polymorphism, packages, interfaces, generics, files and applets?";
							q4="Could you analyze the usage of object oriented programming concepts, exception handling and multithreading?";
							q5="Could you design computer programs to solve problems using object oriented concepts?";
							q6="Were you able to conduct experiments using object oriented concepts to solve problems?";
							q7="Was it possible to design and present solutions for applications using appropriate object oriented concepts?";
							break;
		case "16IS5DCDBM":	q1="Could you comprehend the fundamentals of database management systems, ER model, relational algebra, SQL, design principles and Transaction management?";
							q2="Were you able to apply database management concepts, ER model, relational algebra concepts, database design principles and Transaction management to describe DB to given scenario?";
							q3="Were you able design an application without anomalies using ER modeling, Normalizations, transaction management properties?";
							q4="Could you synthesize sophisticated queries to extract the information from the given database?";
							q5="Did you understand the usage of modern tools to implement the real world applications (database) popular databases?";
							q6="Could you communicate effectively as a member in a diverse teams?";
							q7="Could you analyse the concepts of database management principles, Entity –Relationship model, ER to Relational mapping, relational algebra and database design principles?"; 
							break;
		case "16IS5DCDCN":	q1="Did you acquire the Knowledge about the various principles of data communication in datalink layer and network layer?";
							q2="Could you analyze the need of for different protocols in datalink layer and network layer of TCP/IP protocol suite?";
							q3="Were you able to design network using internetworking concepts and related protocol by analysing the need various routing protocols for different scenarios?";
							q4="Could you design wireless LAN, any network using internetworking concepts and protocols?";
							q5="Could you conduct simulation on a given network for global addressing, subnetting, routing and protocol usage?";
							q6="Did you conduct experiments on design of networking concepts using modern engineering tool?";
							q7="Was the course material satisfactory?";
							break;
		case "16IS5DCWEP":	q1="Do you feel like you have acquired the basic knowledge of scripting language to build web pages";
							q2="Could you use XHTML concepts to provide interactive websites for client-server systems?";
							q3="Were you Validate user inputs based on constraints and requirements using javascript?";
							q4="Could you Identify appropriate web elements to prepare dynamic pages?";
							q5="Did you learn interact with client-server systems on user specific mark-up language?";
							q6="Were you able to conduct experiments for the real time concepts of web programming?";
							q7="Was the course material satisfactory?";
							break;
		case "16IS5DEPYP":
			q1="Did you Understand the Python environment, basic operations, objects, files, exceptions, OOPs concepts, databases and System tools?";
			q2="Could you Use operations and constructs of programming to implement solutions for engineering problems.?";
			q3="Were you able to provide an analysis for usage of file operations, exception hierarchy and connectivity to database.?";
			q4="Could you justify the importance of different programming constructs and system tools?";
			q5="Were you able to implement control structures using appropriate techniques and resources.?";
			q6="Could you interpret various scenario based problems to provide feasible solutions?";
			q7="Was the course material satisfactory?";
			break;
							
		default: q1=q2=q3=q4=q5=q6=q7="Question";
		
							
							
		}
	}
	student_page3(String usn,String ccode){
//public static void main(String args[]) { 
		assignQuestion(ccode);
		
		
		

JFrame f=new JFrame("Student page3");  
	 	JLabel s_h;
	 	s_h=new JLabel(" Course Feedback ");  
	 	s_h.setBounds(500,30,150,30); 
      
	 	JLabel s_r;
	 	s_r=new JLabel("Enter a number between 1 and 5");  
	 	s_r.setBounds(450,70,500,30);
     
	 	JLabel s_q1;
	 	s_q1=new JLabel(q1);  
	 	s_q1.setBounds(50,180,1000,30);
    
    	JTextField r_q1;
    	r_q1 = new JTextField();
    	r_q1.setBounds(1200,180,100,30);
	
    	JLabel s_q2;
		s_q2=new JLabel(q2);  
		s_q2.setBounds(50,230,1000,30); 
		
		JTextField r_q2;
    	r_q2 = new JTextField();
    	r_q2.setBounds(1200,230, 100,30);
	
	    
		JLabel s_q3;
		s_q3=new JLabel(q3);  
		s_q3.setBounds(50,280, 1000,30);
		
		JTextField r_q3;
    	r_q3 = new JTextField();
    	r_q3.setBounds(1200,280, 100,30);
	
	    
		JLabel s_q4;
		s_q4=new JLabel(q4);  
		s_q4.setBounds(50,320,1000,30);
		
		JTextField r_q4;
    	r_q4 = new JTextField();
    	r_q4.setBounds(1200,320, 100,30);
	
	    
	    JLabel s_q5;
	    s_q5=new JLabel(q5);  
	    s_q5.setBounds(50,370, 1000,30);
	    
	    JTextField r_q5;
    	r_q5 = new JTextField();
    	r_q5.setBounds(1200,370, 100,30);
	
    
	    JLabel s_q6;
	    s_q6=new JLabel(q6);  
	    s_q6.setBounds(50,420, 1000,30);
	    
	    JTextField r_q6;
    	r_q6 = new JTextField();
    	r_q6.setBounds(1200,420, 100,30);
    	
    	JLabel s_q7;
	    s_q7=new JLabel(q7);  
	    s_q7.setBounds(50,470, 1000,30);
	    
	    JTextField r_q7;
    	r_q7 = new JTextField();
    	r_q7.setBounds(1200,470, 100,30);
	
	    
	    JButton b1=new JButton("Submit"); 
	    b1.setBounds(500,520,100,30); 
	    
	    f.setLayout(null);
	    f.setSize(1600,1600);
	    f.setVisible(true);
	    f.add(s_h);
	    f.add(s_r);
	    f.add(r_q1);
	    f.add(r_q2);
	    f.add(r_q3);
	    f.add(r_q4);
	    f.add(r_q5);
	    f.add(r_q6);
	    f.add(r_q7);
	    f.add(s_q1);
	    
	    f.add(s_q2);
	    
	    f.add(s_q3);
	    
	    f.add(s_q4); 
	    
	    f.add(s_q5);
    
	    f.add(s_q6);
	    f.add(s_q7);
	    f.add(b1);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    String rating[] = new String[7];
	    
	       
	        class thehandler implements ActionListener
	        {
	        	public void actionPerformed(ActionEvent event)
	        	{
	        		if(event.getSource()==b1)
	        		{
	        			DbConnection db =  new DbConnection();
	        			
	        			//System.out.println("rating[0] :"+r_q1.getText());
	        		    rating[0]=r_q1.getText();
	        		    rating[1]=r_q2.getText();
	        		    rating[2]=r_q3.getText();
	        		    rating[3]=r_q4.getText();
	        		    rating[4]=r_q5.getText();
	        		    rating[5]=r_q6.getText();
	        		    rating[6]=r_q7.getText();
	        	    
	        		    db.insertRatings(usn,ccode,rating);
	        		    @SuppressWarnings("unused")
						student_page2 o = new student_page2(usn);
	        		    
	        		}
	        	}
	        }
	        thehandler handler= new thehandler();
	        b1.addActionListener(handler);


	    
	    
	    
	    
}  
}  