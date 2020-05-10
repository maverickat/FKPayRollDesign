package FKPayRoll;

import java.util.Scanner;
import java.util.Calendar;
import java.sql.*;
import com.mysql.cj.jdbc.Driver.*;

public class PayRoll{
	public static void GenPayRoll(){
		Calendar cal = Calendar.getInstance();
		int day  = cal.get(Calendar.DAY_OF_WEEK);
		if(day==6){
			try{
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/info","atif","atif");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select id,first,last,toPay from emp where type =" + 1);
		while(rs.next())
		{
		int id = rs.getInt("id");
		String first = rs.getString("first");
		String last = rs.getString("last");
		double toPay = rs.getDouble("toPay");
		System.out.println("\nEmployee: "+id+" Name: "+ first +" " +last + " gets: "+ toPay);}
		String q = "UPDATE emp SET toPay = 0 where type  = 1";
		PreparedStatement p = con.prepareStatement(q);
		p.execute();
		con.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
		}
		Home.main(null);
}
}
