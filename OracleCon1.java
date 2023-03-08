import java.sql.*;
class OracleCon1
{
	public static void main(String[] args) 
	{
		try
		{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcab2213","mtcab2213");
		 Statement stmt=con.createStatement();
		 String s1;
		 s1="insert into student"+"(rollno,sname,age)"+"values(24,'test24',34)";
		 		  String s;
		 s="insert into student"+"(rollno,sname,age)"+"values(23,'test23',33)";
		 		 		 ResultSet rs=stmt.executeQuery(s);
		 ResultSet rs1=stmt.executeQuery(s1);
				 		 stmt.executeUpdate(s);
		 stmt.executeUpdate(s1);
		 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
