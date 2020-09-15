import java.lang.*;

class Account 
{

    private String accountNo;
    private double balance;

    Account() 
    {

    }

    Account(String accountNo, double balance) 
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void setAccountNo(String accountNo) 
    {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public String getAccountNo() 
    {
        return accountNo;
    }

    public double getBalance() 
    {
        return balance;
    }

}