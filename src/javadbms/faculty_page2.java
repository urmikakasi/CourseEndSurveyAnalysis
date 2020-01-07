package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;  
public class faculty_page2 { 
	 int[] count= new int[5];
	 String[] result= new String[55];
	 String ccode;
faculty_page2(String facid) {
    
	JFrame f=new JFrame("page2");  
    
    JLabel f_h;
    f_h=new JLabel("Course");  
    f_h.setBounds(160,40,100,30);
    
    
    DbConnection db = new DbConnection();
    String c = db.getcourses(facid);
    ccode=" ";
    switch(c)
    {
    case "Database Programming":
		ccode= "16IS5DCDBM";
		break;
	case "Data Communication And Networking":
		ccode= "16IS5DCDCN";break;
	case "Java Programming":
		ccode= "16IS5DCJAV";break;
	case "Web Programming":
		ccode= "16IS5DCWEP";break;
	case "Python Programming":
		ccode="16IS5DEPYP";
    }
    //int [] count=new int[5];
   
    rating_page r = new rating_page();
    count= r.ratings(ccode);
    
    result=r.ratings_set(ccode);
   
    

    
    
    
    JButton course1=new JButton(c); 
    course1.setBounds(50,100,200,30);
    
         
    f.add(f_h);
    f.add(course1);
   
  
    f.setSize(450,500);  
    f.setLayout(null);  
    f.setVisible(true);  
    
    class thehandler implements ActionListener
    {
    	
    	public void actionPerformed(ActionEvent event)
    	{
    		if(event.getSource()==course1)
    		{
    			
    			faculty_page3 o= new faculty_page3(count,result);
    		}
    	}
    }
    thehandler handler= new thehandler();
    course1.addActionListener(handler);

    //return ccode;
}


}