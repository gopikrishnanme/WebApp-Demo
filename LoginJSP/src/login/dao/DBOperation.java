package login.dao;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import login.util.JDBCConnection;

public class DBOperation {
	Connection con=null;
	Statement st=null;
	public DBOperation()
	{
		try {
			con=new JDBCConnection().getConnect();
			st=con.createStatement();
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	public String create()
	{
		String result="";
		try {
			st.execute("create table login1(fname varchar(10),userid varchar(10),pwd varchar(10))");
			result="table created";
		} 
		catch (SQLException e) {
			result="error at creation";
			e.printStackTrace();
		}
		return result;
	}
	public String insert(String name, String uname, String pwd)
	{
		String result="";
		try {
			String qry=" insert into login1 values(?,?,?) ";
			PreparedStatement pst=con.prepareStatement(qry);
			pst.setString(1, name);
			pst.setString(2, uname);
			pst.setString(3, pwd);
			pst.executeQuery();
			result="user registered";
		} 
	
		catch (SQLException e) {
			result="error at insert";
			e.printStackTrace();
		}
		catch (Exception e) {
			result="error at insert";
			e.printStackTrace();
		}
	
		return result;
	}
	public String retrive(String user,String pwd)
	{
		String result="fail";
		try {
			ResultSet rs=st.executeQuery("select * from login1");
			while(rs.next())
			{
				if(rs.getString(2).equals(user) && rs.getString(3).equals(pwd))
				{
					result="success";
					break;
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List display(String user)
	{
		List result=new ArrayList<>();
		
		try {
			ResultSet rs=st.executeQuery("select * from login1 where userid='"+user+"'");
			while(rs.next())
			{
				result.add(rs.getString(1));
				result.add(rs.getInt(4));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	public String update()
	{
		String result="";
		
		return result;
	}
	public String delete()
	{
		String result="";
		try {
			st.execute("drop table login");
			result="table deleted";
		} 
		catch (SQLException e) {
			result="error at deletion";
			e.printStackTrace();
		}
		return result;
	}

}
