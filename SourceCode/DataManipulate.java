package FKPayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataManipulate{

	private static Scanner inp = new Scanner(System.in);
	public static void AddEmployee(){
		System.out.println("\nFirst Name: ");
		String first = inp.nextLine();
		System.out.println("\nLast Name: ");
		String last = inp.nextLine();
		System.out.println("\nEmpId: ");
		int id = inp.nextInt();
		System.out.println("\nType of Worker : 1 for hourly or 2 for monthly");
		int x = inp.nextInt();
		if(x==1){
			System.out.println("\nHourly Rate: ");
			double r = inp.nextDouble();
			Employee e = new EmployeeHour(first,last,id,r);
			MySqlCon.AddEmp(first,last,id,1,r);
			System.out.println("\nSuccessfull");
			}
		if(x==2){
			System.out.println("\nMonthly Salary: ");
			double r = inp.nextDouble();
			Employee e = new EmployeeMonth(first,last,id,r);
			MySqlCon.AddEmp(first,last,id,2,r);
			System.out.println("\nSuccessfull");
			}
		Home.main(null);
	}
	
	public static void PostTime(){
		System.out.println("\nEmpId: ");
		int id = inp.nextInt();
		System.out.println("\nHoursWorked: ");
		double hours = inp.nextDouble();
		int x = MySqlCon.PostTime(id,hours);
		if(x==0)
		System.out.println("\nSuccessFull");
		else
		System.out.println("\nID Doesn't Exist");
		
		Home.main(null);
	}
}

