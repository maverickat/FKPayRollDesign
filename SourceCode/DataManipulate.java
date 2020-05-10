package FKPayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataManipulate{
	public static List<Employee> employees = new ArrayList<Employee>();
	public static void AddEmployee(){
		Scanner inp = new Scanner(System.in);
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
			employees.add(e);
			MySqlCon.AddEmp(first,last,id,1,r);
			System.out.println("\nSuccessfull");
			}
		if(x==2){
			System.out.println("\nMonthly Salary: ");
			double r = inp.nextDouble();
			Employee e = new EmployeeMonth(first,last,id,r);
			MySqlCon.AddEmp(first,last,id,2,r);
			employees.add(e);
			System.out.println("\nSuccessfull");
			}
		Home.main(null);
	}
}

