import java.lang.*;

public class Main
{
	public static void main(String []args)
	{
		
        Account a1 = new SavingsAccount ("0813" , 5000.50 , 35.50); 
		Account a2 = new FixedAccount ("0501" , 55000.50 , 3);	
		//Account a3 = new FixedAccount ("0501" , 55000.50 , 3);
		Customer c1 = new Customer(12345 , "Sakib Hossain Rijon" , 3);
		c1.addAccount(a1);
		c1.addAccount(a2);
		//c1.addAccount(a3);
		//c1.removeAccount(a3);

	    System.out.println("1st Customer Info : ");
		System.out.println("Customer NID: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("Customer Savings Account Number: "+c1.accounts[0].getAccountNo());
		System.out.println("Customer Savings Account Balance: "+c1.accounts[0].getBalance());
		System.out.println("Customer Savings Account Interest Rate: "+c1.accounts[1].getTenureYear());
		//c1.showAllAccounts();


		
	}
}

