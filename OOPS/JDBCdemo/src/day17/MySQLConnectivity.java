package day17;
import java.sql.*;

public class MySQLConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");  
			System.out.println("loaded");


			//step 2: get the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Train?autoReconnect=true&useSSL=false", "root", "root");
			System.out.println("connected .. ");
		
			//step 3:
			Statement stmt= con.createStatement();
			stmt.execute("insert into employee values(5,'mayu',20000,35)");
			System.out.println("inserted.. ");
		
		
		
		}
		catch(Exception e)
		{
			System.out.println("hello");
		}





	}

}
