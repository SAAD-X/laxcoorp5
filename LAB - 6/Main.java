public class Main {
	public static void main (String [] args )
	{
		Account a1= new FixedAccount ("1111",10000,2024);// Creating FixedAccount object with Account class object reference
		Account a2= new SavingsAccount("2222",5000,7.5);// Creating SavingsAccount object with Account class object reference
		
		
		Customer c1= new Customer(12345,"Kuddus",2); //creating customer object
		
		c1.addAccount(a1);//assigning Fixed Account object in accounts[] array
		c1.addAccount(a2);//assigning Fixed Account object in accounts[] array
		
		c1.showAllAccounts(); 
	
    }
}
