package javadbms;
import java.sql.*;

public class DbConnection {
	//static int index=0;
	String[] select(String s)//select statement to execute
	{
		String[] result= new String[60];

	try{
    	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
    	Statement st= conn.createStatement();
    	//put statement here
    	ResultSet rs= st.executeQuery(s);
    	
    	int index=0;
    	if(s.equals("select * from faculty"))
    	{
    	while(rs.next())
    	{
    		result[index]= rs.getString("fac_id")+"     "+rs.getString("fac_name")+"       "+rs.getString("fac_pass");
    		index++;
    	}
    	
    	}
    	if(s.equals("select * from student"))
    	{
    		index=0;
    		while(rs.next())
    		{
    			result[index]=rs.getString("usn");
    			index++;
    		}
    		
    	}
    	if(s.equals("select * from course"))
    	{
    	while(rs.next())
    	{
    		result[index]= rs.getString("c_id")+"     "+rs.getString("c_name")+"			"+rs.getString("sem");
    		index++;
    	}
    	}
    	
    	
    	
    	if(s.equals("select * from course_assign"))
    	{
    	while(rs.next())
    	{
    		result[index]= rs.getString("c_id")+"     "+rs.getString("fac_id");
    		index++;
    	}
    	}
    	if(s.equals("select * from rating"))
    	{
    		
    		while(rs.next())
    		{
    			result[index]=rs.getString("usn")+" "+rs.getString("c_id")+" "+rs.getString("q1")+" "+rs.getString("q2")+" "+rs.getString("q3")+" "+rs.getString("q4")+" "+rs.getString("q5")+" "+rs.getString("q6")+" "+rs.getString("q7");	
    			index++;
    		}
    	}
    	return result;
    	
    	
    }
	catch(Exception e)
	{
		e.printStackTrace();
		return result;
	}
	
	}
	String[] select1(String s)
	{
		String[] result= new String[60];
		try
		{
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
    	Statement st= conn.createStatement();
    	//put statement here
    	ResultSet rs= st.executeQuery(s);
    	
    	int index=0;
		if(s.equals("select * from rating"))
    	{
    		
    		while(rs.next())
    		{
    			result[index]=rs.getString("usn")+"			 "+rs.getString("c_id")+"		 "+rs.getString("q1")+" 		"+rs.getString("q2")+"		 "+rs.getString("q3")+" 		"+rs.getString("q4")+" 		"+rs.getString("q5")+" 		"+rs.getString("q6")+" 		"+rs.getString("q7");	
    			index++;
    		}
    	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	return result;
	}
	
	
	
	boolean fac_validate(String username, String pass)
	{
		
		

		try{
			
	    	
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
	    	Statement st= conn.createStatement();
	    	//put statement here
	    	String s ="SELECT * FROM faculty";
	    	ResultSet rs= st.executeQuery(s);
	    	
	    	int index=0;
	    	String[] result= new String[10];
	    
	    	while(rs.next())
	    	{
	    		result[index]= rs.getString("fac_id");index++;
	    		result[index]=rs.getString("fac_pass");
	    		index++;
	    	}
	    	
//	    	for(int i=0;i<result.length;i++)
//	    		System.out.println(i+" "+result[i]);
//	    	
	    	int pos=-1;
	    	for(int i=0;i<result.length;i++)
	    	{
	    		
	    		
	    		if(username.equals(result[i]))
	    		{
	    			pos=i;
	    			//System.out.println(result[i]);
	    			break;
	    		}
	    	}  
	    	pos++;
	    	String res=result[pos];
	    	//System.out.println("res :"+res);
	    	if(res.equals(pass))
	    		return true;
	    	
	    	
	    	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return false;
		
		
	}
	
	void addCourse(String fid, String cid)
	{
		try
		{
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
	    	Statement st= conn.createStatement();
	    	String s="insert into course_assign(c_id,fac_id)"+" values(?,?)";
	    	PreparedStatement preparedStmt = conn.prepareStatement(s);
	    	preparedStmt.setString(1,cid);
        	preparedStmt.setString(2,fid);
        	preparedStmt.execute();
        	conn.close();
	    	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void insertRatings(String usn, String ccode, String rating[])
	{
		
		
		try
		{
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
	    	@SuppressWarnings("unused")
			Statement st= conn.createStatement();
	    	String s="insert into rating"+" values(?,?,?,?,?,?,?,?,?)";
	    	PreparedStatement preparedStmt = conn.prepareStatement(s);
	    	preparedStmt.setString(1,usn);
        	preparedStmt.setString(2,ccode);
        	
        	
        	//s="insert into rating(q1,q2,q3,q4,q5,q6,q7) values(?,?,?,?,?,?,?)";
        	//preparedStmt = conn.prepareStatement(s);
        	preparedStmt.setString(3,rating[0]);
        	preparedStmt.setString(4,rating[1]);
        	preparedStmt.setString(5,rating[2]);
        	preparedStmt.setString(6,rating[3]);
        	preparedStmt.setString(7,rating[4]);
        	preparedStmt.setString(8,rating[5]);
        	preparedStmt.setString(9,rating[6]);
        	preparedStmt.execute();
        	
        	conn.close();
	    	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


	
	String getcourses(String facid)
	{
		String c[] = new String[50];
		String cf[]=new String[50];
		
		try{
	    	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/CourseEndSurvey","root","root");
	    	Statement st= conn.createStatement();
	    	//put statement here
	    	ResultSet rs= st.executeQuery("SELECT * FROM course_assign");
	    	
	    	int index=0;
	    	
	    	
	    	while(rs.next())
	    	{
	    		
	    		cf[index]=rs.getString("fac_id");
	    		index++;
	    		cf[index]= rs.getString("c_id");
	    		index++;
	    	}
	    	int pos=-1;
	    	for(int i=0;i<cf.length;i++)
	    	{
	    		
	    		
	    		if(facid.equals(cf[i]))
	    		{
	    			pos=i;
	    			
	    			break;
	    		}
	    	}  
	    	pos++;
	    	c[0]=cf[pos];
	    	
	    	System.out.println(c[0]);
	    	switch(c[0])
	    	{
	    	case "16IS5DCDBM":
	    		return "Database Programming";
	    	case "16IS5DCDCN":
	    		return "Data Communication And Networking";
	    	case "16IS5DCJAV":
	    		return "Java Programming";
	    	case "16IS5DCWEP":
	    		return "Web Programming";
	    	case "16IS5DEPYP":
	    		return "Python Programming";
	    	}
	    	
	    	
	    	
	    
	    }
		catch(Exception e)
		{
			e.printStackTrace();
			return "Error";
		}
		return "null";
		
		
		
	}
	
	
	
	
}