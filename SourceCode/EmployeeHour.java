package FKPayRoll;

public class EmployeeHour extends Employee{

	public EmployeeHour(String first,String last,int id,double rate){
		super(first,last,id);
		super.Rate = rate;
		}
		
	public static double SetBasePay(double hours,double Rate,double BasePay){
		 BasePay += Rate*hours;
		 if(hours>8)
		 BasePay += Rate*(hours-8)*0.5;
		 return BasePay;
		}
		
	public void SetCommPay(){
		//Calculation
		CommPay = 0;
		}
}
	
	
