package login.util;
import java.sql.*;

public class JDBCConnection {
	
	public Connection getConnect()
	{
		Connection con=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"SYSTEM","admin");
			
//			Class.forName("com.mysql.jdbc.Driver");
//			con=DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/test",
//					"root","admin");	
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return con;
	}

}
