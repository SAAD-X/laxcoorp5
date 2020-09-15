public class Customer {
	private int nid;
	private String name;
	private Account accounts[];// Customer class HAS A Account (one to many association)
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}*/
	public Customer ()//constructor
	{
		
	}
	public Customer (int nid, String name,int size)//parameterized constructor
	{
		this.nid=nid;
		this.name=name;
		accounts= new Account [size];
	}
	public void addAccount(Account a)//function to assign object in array
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==null)
			{
				accounts[i]=a; 
				break;
			}
			
		}
	}
	public void removeAccount(Account a)//function to remove object from array
	{

		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==a)
			{
				accounts[i]=null; 
				break;
			}
			
		}
	}
	public void showCustomerInfo()
	{
		System.out.println("Customer Info: ");
		System.out.println("------------------------------");
		System.out.println("NID :"+ nid);
		System.out.println("Name :"+ name);	
	}
	public void showAllAccounts()
	{
		showCustomerInfo();
		
		for(int i=0;i<accounts.length;i++)
		
		{
			if(accounts[i] != null)
			{
				System.out.println("Fixed Account Number: "+accounts[i].getAccountNo());
				System.out.println("Fixed Account Balance: "+accounts[i].getBalance());
				System.out.println("Fixed Account Tenure Year: "+accounts[i].getTenureYear());
								
				
				System.out.println("Savings Account Number: "+accounts[i+1].getAccountNo());
				System.out.println("Savings Account Balance: "+accounts[i+1].getBalance());
				System.out.println("Savings Account Interest Rate: "+accounts[i+1].getInterestRate());
				break;
			}
		
		}
	}
}
