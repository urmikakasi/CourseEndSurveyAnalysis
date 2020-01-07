package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class faculty_page3 {  

	faculty_page3(int [] count,String resultset[]){
		//System.out.println("CCODE"+ccode);
	

    JFrame f=new JFrame("Faculty page3");  
    JLabel f_h;
    f_h=new JLabel(" Course Rating ");  
    f_h.setBounds(20,20,500,500);
    
    DbConnection db= new DbConnection();
    String[] result= new String[50];
    result=db.select1("select * from rating");
    
    int i,j=0;
	String[][] res1= new String[55][9];
	int len=0;
	try
	{
	for(i=0;i<resultset.length;i++)
	{
		if(!resultset[i+1].equals(null))
		len++;
		//System.out.println(len);
	}
	}
	catch(NullPointerException e)
	{
		
	}
	len++;
	for(i=0;result[i]!=null;i++)
	{
		
		res1[i]=result[i].split(" ",9);
		
	}
//	for(i=0;i<len;i++)
//	System.out.println(res1[i][1]);
//    
    int y=380;
    
    for(i=0;i<len;i++)
    {
    	System.out.println(resultset[i]);
    }
    
    for(i=0;i<len;i++)
    {
    	JLabel data;
//    	if(res1[i][1].equals(ccode))
//    	{
    	data= new JLabel(resultset[i]);
    	//System.out.println(res1[i][1]);
    	data.setBounds(180,y,300,30);
    	y=y+50;
    	f.add(data);
    	f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);
        //j++;
    	//}
    }
    


    JLabel f_q1;
    f_q1=new JLabel("Number of 5s:	"+count[4]);  
    f_q1.setBounds(150,80,500,30); 
   
    JLabel f_q2;
    f_q2=new JLabel("Number of 4s:	"+count[3]);  
    f_q2.setBounds(150,130,500,30); 
    
    JLabel f_q3;
    f_q3=new JLabel("Number of 3s:	"+count[2]);  
    f_q3.setBounds(150,180, 500,30);
    
    JLabel f_q4;
    f_q4=new JLabel("Number of 2s:	"+count[1]);  
    f_q4.setBounds(150,230,500,30);
    
    JLabel f_q5;
    f_q5=new JLabel("Number of 1s:	"+count[0]);  
    f_q5.setBounds(150,280, 500,30); 

    float avg=0;
    avg=5*count[4]+4*count[3]*3*count[2]+2*count[1]+1*count[0];
    avg/=7;
    
    JLabel f_q6;
    f_q6=new JLabel("Average rating: "+avg);  
    f_q6.setBounds(50,450, 500,30); 
    
    
    
    JButton b2=new JButton("Logout"); 
    b2.setBounds(150,360,100,30);

    //f.add(f_h);
    f.add(f_q1);
    f.add(f_q2);
    f.add(f_q3);
    f.add(f_q4); 
    f.add(f_q5);
    //f.add(f_q6);
    //f.add(b1);
    //f.add(b2);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);  
   
}  
}  