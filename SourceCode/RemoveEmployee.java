package FKPayRoll;

import java.sql.*;
import com.mysql.cj.jdbc.Driver.*;

public class RemoveEmployee{
	public static void RemoveEmp(int id){
	
	try{
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/info","atif","atif");
		String q = "delete from emp where " + "id = " +id;
		Statement st = con.createStatement();
		PreparedStatement p = con.prepareStatement(q);
		p.execute();
		con.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}
