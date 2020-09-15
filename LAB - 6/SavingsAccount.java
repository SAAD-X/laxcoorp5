public class SavingsAccount extends Account //SavingsAccount class inherits Account class
{

	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public SavingsAccount()//constructor
	{
		
	}
	public SavingsAccount(String accountNo, double balance,double interestRate) //parameterized constructor
	{
		 super(accountNo,balance);//variables from super class 
		 this.interestRate=interestRate;
	}
	public void showSavingsAccountInfo()
	 {
		//System.out.println("Savings Account Info:"); 
		super.showAccountInfo();
		System.out.println("Interest Rate "+ interestRate);
		
	 }

}
