package FKPayRoll;

import java.util.Scanner;
import java.sql.*;
import com.mysql.cj.jdbc.Driver.*;

public class Home{
	
	public static void main(String args[]){
		System.out.println("\n\tWelcome To PayRoll\n");
		System.out.println("\nPress Given Numbers For Different Features:\n");
		System.out.println("\n1\tfor Adding new Employee");
		System.out.println("\n2\tGenerate Time Stamp");
		System.out.println("\n3\tFor Update Details Related To Employee");
		System.out.println("\n4\tTo Post A Sale");
		System.out.println("\n5\tTo Update Details Related To Union");
		System.out.println("\n6\tfor Removing Employee");
		System.out.println("\n7\tfor Generate Pay Roll");
		System.out.println("\n9\tfor EXIT");
		try{
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();
		if(x == 1){
			DataManipulate.AddEmployee();
		}
		if(x==2)
		{
			DataManipulate.PostTime();
		}
		if(x==3)
			DataManipulate.Update();
		if(x==4)
			DataManipulate.PostSale();
		if(x==5)
			DataManipulate.Union();
		if(x==6)
			DataManipulate.RemoveEmp();
		if(x==7)
			PayRoll.GenPayRoll();
		if(x==9)
		System.out.println("THANK YOU :)");
		}
		catch(Exception e){
		System.out.println("\nExpected Int data type");
	}
}
}
