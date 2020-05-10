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
}
		
