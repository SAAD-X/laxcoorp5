public class FixedAccount extends Account //FixedAccount class inherits Account class
{
	private int tenureYear;
	
	
	
	public int getTenureYear() {
		return tenureYear;
	}
	public void setTenureYear(int tenureYear) {
		this.tenureYear = tenureYear;
	}
	public FixedAccount ()//constructor
	{
		
	}
	 public FixedAccount (String accountNo, double balance, int tenureYear) //parameterized constructor
	 {
		 
		 super(accountNo,balance);//variables from super class 
		 this.tenureYear=tenureYear;
		 
	 }

	 public void showFixedAccountInfo()
	 {
		 //System.out.println("Fixed Account Info:");
		 super.showAccountInfo();//calling function from superclass
		 System.out.println("Tenure Year "+ tenureYear);
		 
	 }
}
