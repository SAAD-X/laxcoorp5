import java.lang.*;
//Create a subclass for Account class called FixedAccount
public class FixedAccount extends Account
{
	private int tenureYear;
	public FixedAccount()
	{

	}
	public FixedAccount(String accountNo, double balance, int tenureYear)
	{
		//Using super keyword to access the superclass constructor
		super(accountNo, balance);
		this.tenureYear = tenureYear;
	}
	public void setTenureYear(int tenureYear)
	{		
		this.tenureYear = tenureYear;
	}
	public int getTenureYear(){return tenureYear;}
}