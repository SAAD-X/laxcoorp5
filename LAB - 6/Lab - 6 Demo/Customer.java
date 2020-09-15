import java.lang.*;
public class Customer
{
	private int nid;
	private String name;
	public Account accounts[];
	public Customer()
	{
	}
	public Customer(int nid, String name, int size)
	{
		this.nid = nid;
		this.name = name;
        accounts = new Account[size];
	}
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getNid(){return nid;}
	public String getName(){return name;}

	public void addAccount(Account a)
	{
	  for(int i=0;i<accounts.length;i++)
	  {
	  	if(accounts[i] == null)
	  	{
	  		accounts[i] = a;
	  		System.out.println("object is assign in index ["+i+"]");
	  		break;
	  	}	  	
	  }

	}
	public void removeAccount(Account a) 
	{
	  for(int i=0;i<accounts.length;i++)
	  {
	  	if(accounts[i] == a)
	  	{
	  		accounts[i] = null;
	  		System.out.println("object is removed from index ["+i+"]");
	  		break;
	  	}
      }
    }
public  void showAllAccounts()
{
	for(int i=0;i<accounts.length;i++)
	  {
	  	if(accounts[i] != null)
	  	{
        System.out.println("Customer Savings Account Number: "+accounts[i].getAccountNo());
		System.out.println("Customer Savings Account Balance: "+accounts[i].getBalance());
		//System.out.println("Customer Savings Account Interest Rate: "+accounts[i].getInterestRate());
		System.out.println("Customer Fixed Account Number: "+accounts[i].getAccountNo());
		System.out.println("Customer Fixed Account Balance: "+accounts[i].getBalance());
		//System.out.println("Customer Fixed Account Tenure Year: "+accounts[i].getTenureYear());
		System.out.println();
	  		
	  	}
	  	
	  }
}

   

}