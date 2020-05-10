package FKPayRoll;

public class EmployeeMonth extends Employee{
	public EmployeeMonth(String first,String last,int id,double rate){
		super(first,last,id);
		super.Rate = rate;
		}

	public void SetBasePay(){
		 BasePay =Rate;
		}
		
	public void SetCommPay(){
		//Calculation
		CommPay = 0;
		}
		
}
