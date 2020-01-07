package javadbms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class admin_page5 {  
admin_page5() {  

    JFrame f=new JFrame("Admin page5");  
    JLabel a_h;
    a_h=new JLabel("Add Course");  
    a_h.setBounds(100,30,100,30); 
  
    JLabel a_id1;
    a_id1=new JLabel("Faculty ID:");  
    a_id1.setBounds(50,80, 100,20); 
    JComboBox<String> comboBox2 = new JComboBox<String>();
    comboBox2.addItem("F001");
    comboBox2.addItem("F002");
    comboBox2.addItem("F003");
    comboBox2.addItem("F004");
    comboBox2.addItem("F005");
    comboBox2.setSelectedItem(null);
	comboBox2.setBounds(150, 80,100,20);

    
    
    
    //JTextField a_id2;
    //a_id2=new JTextField();
	//a_id2.setBounds(150,80,100,20);
    
    JLabel a_course;
    a_course=new JLabel("COURSE:");  
    a_course.setBounds(50,160, 100,20); 
    
    JComboBox<String> comboBox1 = new JComboBox<String>();
    comboBox1.addItem("16IS5DCDBM");
	comboBox1.addItem("16IS5DCDCN");
    comboBox1.addItem("16IS5DCJAV");
    comboBox1.addItem("16IS5DCWEP");
    comboBox1.addItem("16IS5DEPYP");
	comboBox1.setSelectedItem(null);
	comboBox1.setBounds(150, 160,100,20);
    
   
    JButton b1=new JButton("Back"); 
    b1.setBounds(30,300,100,30); 
    
    JButton b2=new JButton("Add"); 
    b2.setBounds(150,300,100,30); 

    f.add(a_h);
    f.add(a_id1);
//    f.add(a_id2);
    //f.add(a_sem);
    f.add(comboBox2);
    f.add(a_course);
    f.add(comboBox1);
    f.add(b1);
    f.add(b2);
    f.setSize(450,500);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    
    class thehandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(event.getSource()==b1)
    		{
    			@SuppressWarnings("unused")
				admin_page2 o = new admin_page2();
       		}
    		if(event.getSource()==b2)
    		{
    			String fid=comboBox2.getSelectedItem().toString();
    			String cid=comboBox1.getSelectedItem().toString();
    			DbConnection db= new DbConnection();
    			db.addCourse(fid, cid);
    		}	
    		
    	}
    }
    
    thehandler handler= new thehandler();
    b1.addActionListener(handler);
    b2.addActionListener(handler);
    
    
}  
}  