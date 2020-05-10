package FKPayRoll;

public abstract class Employee{
	private int EmpId;
	private String FirstName;
	private String LastName;
	private String PayMethod;
	protected double Rate;
	protected double BasePay;
	private double CommRate;
	protected double CommPay;
	private double UnionRate;	
	
	public Employee(String first,String last,int id){
		FirstName = first;
		LastName = last;
		EmpId = id;
		BasePay = 0;
		CommPay =0;
		}
		
	public void SetPayMethod(String meth){
		PayMethod = meth;
		}
		
	public void SetUnionRate(double rate){
		UnionRate = rate;
		}
	
	public void SetCommRate(double rate){
		CommRate = rate;
		}
	
	public void SetRate(double rate){
		Rate = rate;
		}
		
	public double GetBasePay(){
		double ret = BasePay;
		BasePay = 0;
		return ret;
		}
	
	public double GetCommPay(){
		double ret = CommPay;
		CommPay = 0;
		return ret;
		}
}
	
