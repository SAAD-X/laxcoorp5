public class Account {
	private String accountNo;
	private double balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getTenureYear() {
		return 0;
	}
	public double getInterestRate() {
		return 0;
	}
	

	public Account()//constructor
	{
		
	}
	public Account(String accountNo, double balance) //parameterized constructor
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void showAccountInfo()
	{
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
	}
	
}
