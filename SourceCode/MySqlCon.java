package FKPayRoll;

import java.sql.*;
import com.mysql.cj.jdbc.Driver.*;

public class MySqlCon{
	public static void AddEmp(String first,String last,int id,int type,double rate){
	try{
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/info","atif","atif");
		String q = "insert into emp (first,last,id,type,rate)" + " values (?,?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);
		p.setString(1,first);
		p.setString(2,last);
		p.setInt(3,id);
		p.setInt(4,type);
		p.setDouble(5,rate);
		p.execute();
		con.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
	public static int PostTime(int id ,double hours){
	try{
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/info","atif","atif");
		String q = "insert into Hourlog (id,Log,hours)" + " values (?,NOW(),?)";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select rate,topay from emp where id =" + id);
		if(!rs.next())
		{
		con.close();
		return 1;}
		double rate = rs.getDouble("rate");
		double BasePay = rs.getDouble("topay");
		PreparedStatement p = con.prepareStatement(q);
		p.setInt(1,id);
		p.setDouble(2,hours);
		p.execute();
		BasePay = EmployeeHour.SetBasePay(hours,rate,BasePay);
		q = "UPDATE emp SET topay = " + BasePay + " where id = " + id;
		p = con.prepareStatement(q);
		p.execute();
		con.close();
		}
		catch(Exception e){
		System.out.println(e);
		return 1;
		}
		return 0;
	}
	public static int Update(int x,int id,String newdet){
	try{
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/info","atif","atif");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select rate,topay from emp where id =" + id);
		if(!rs.next())
		{
		con.close();
		return 1;}
		String q= null;
		if(x==1)
		q = "UPDATE emp SET PayMethod = " + newdet + " where id = " + id;
		else if(x==2)
		q = "UPDATE emp SET rate = " + newdet + " where id = " + id;
		else if(x==3)
		q = "UPDATE emp SET comm = " + newdet + " where id = " + id;
		else 
		return 1;
		PreparedStatement p = con.prepareStatement(q);
		p.execute();
		con.close();
		}
		catch(Exception e){
		System.out.println(e);
		return 1;
		}
		return 0;
	}
	
}
		
