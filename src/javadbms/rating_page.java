package javadbms;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class rating_page {
	int[] ratings(String ccode)
	{
		
		
		
		DbConnection db= new DbConnection();
		String[] res= new String[55];
		res=db.select("select * from rating");
		int i,j;
		String[][] res1= new String[55][9];
		int len=0;
		try
		{
		for(i=0;i<res.length;i++)
		{
			if(!res[i+1].equals(null))
			len++;
			//System.out.println(len);
		}
		}
		catch(NullPointerException e)
		{
			
		}
		len++;
		for(i=0;res[i]!=null;i++)
		{
			
			res1[i]=res[i].split(" ",9);
			
		}
//		for(i=0;res[i]!=null;i++)
//			System.out.println(res1[i][1]);
		for(i=0;i<len;i++)
		{
			for(j=0;j<8;j++)
				System.out.print(res1[i][j]+" ");
			System.out.println();
		}
		
		String[] res2= new String[55];
		int m,n;
		m=n=0;
		int c1,c2,c3,c4,c5;
		c1=c2=c3=c4=c5=0;
		for(i=0;i<len;i++)
		{
			if(res1[i][1].equals(ccode))
			{
				//System.out.println(res1[i][1]);
				res2[m]=res1[i].toString();
				for(j=2;j<8;j++)
				{
					if(res1[i][j].equals("5"))
						c5++;
					if(res1[i][j].equals("4"))
						c4++;
					if(res1[i][j].equals("3"))
						c3++;
					if(res1[i][j].equals("2"))
						c2++;
					if(res1[i][j].equals("1"))
						c1++;
					
				}
			}
		}
	
		int[] count= new int[5];
		count[0]=c1;//no of 1s
		count[1]=c2;
		count[2]=c3;
		count[3]=c4;
		count[4]=c5;
		
	
	
		return count;
		
		
	}

	String[] ratings_set(String ccode)
	{
		
		
		
		DbConnection db= new DbConnection();
		String[] res= new String[55];
		res=db.select("select * from rating");
		int i,j;
		String[][] res1= new String[55][9];
		int len=0;
		try
		{
		for(i=0;i<res.length;i++)
		{
			if(!res[i+1].equals(null))
			len++;
			//System.out.println(len);
		}
		}
		catch(NullPointerException e)
		{
			
		}
		len++;
		for(i=0;res[i]!=null;i++)
		{
			
			res1[i]=res[i].split(" ",9);
			
		}
//		for(i=0;res[i]!=null;i++)
//			System.out.println(res1[i][1]);
//		for(i=0;i<len;i++)
//		{
//			for(j=0;j<8;j++)
//				System.out.print(res1[i][j]+" ");
//			System.out.println();
//		}
		
		String[] res2= new String[55];
		int m,n;
		m=n=0;
		int c1,c2,c3,c4,c5;
		c1=c2=c3=c4=c5=0;
		for(i=0;i<len;i++)
		{
			if(res1[i][1].equals(ccode))
			{
				//System.out.println(res1[i][1]);
				String str= res1[i][0]+"	"+res1[i][1]+"	"+res1[i][2]+"	"+res1[i][3]+"	"+res1[i][4]+"	"+res1[i][5]+"	"+res1[i][6]+"	"+res1[i][7]+"	"+res1[i][8];
				res2[m]=str;
				m++;
				for(j=2;j<8;j++)
				{
					if(res1[i][j].equals("5"))
						c5++;
					if(res1[i][j].equals("4"))
						c4++;
					if(res1[i][j].equals("3"))
						c3++;
					if(res1[i][j].equals("2"))
						c2++;
					if(res1[i][j].equals("1"))
						c1++;
					
				}
			}
		}
	
		int[] count= new int[5];
		count[0]=c1;//no of 1s
		count[1]=c2;
		count[2]=c3;
		count[3]=c4;
		count[4]=c5;
		
	
	
		return res2;
		
		
	}


}
