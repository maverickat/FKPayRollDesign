package FKPayRoll;

public class EmployeeHour extends Employee{

	public EmployeeHour(String first,String last,int id,double rate){
		super(first,last,id);
		super.Rate = rate;
		}
		
	public void SetBasePay(){
		//Calculation
		 BasePay =0;
		}
		
	public void SetCommPay(){
		//Calculation
		CommPay = 0;
		}
}
	
	
