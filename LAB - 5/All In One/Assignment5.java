import java.lang.*;

 class Account
{
	private String accountNo;
	private double balance;

public Account()
{

}
public Account(String accountNo , double balance)
{
	this.accountNo = accountNo;
	this.balance = balance;
}

public void setAccountNo(String accountNo)
{
	this.accountNo = accountNo;
}
public String getAccountNo()
{
	return accountNo;
}

public void setBalance(double balance)
{
	this.balance = balance;
}
public double getBalance()
{
	return balance;
}
}

class SavingsAccount extends Account
{
	private double interestRate;

	SavingsAccount()
	{

	}

	SavingsAccount(String accountNo , double balance , double interestRate)
	{
		super(accountNo , balance);
		this.interestRate = interestRate;
	}

	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
}

class FixedAccount extends Account
{
	private int tenureYear;

	FixedAccount()
	{

	}

	FixedAccount(String accountNo, double balance, int tenureYear)
	{
		super(accountNo , balance);
		this.tenureYear = tenureYear;
	}

	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
} 

class Customer
{
	private int nid;
	private String name;
	private SavingsAccount sa;
	private FixedAccount fa;

	Customer()
	{

	}
	Customer(int nid , String name , SavingsAccount sa , FixedAccount fa)
	{
		this.nid = nid;
		this.name = name;
		this.sa = sa;
		this.fa= fa;
	}

	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public int getNid()
	{
		return nid;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setSavingsAccount(SavingsAccount sa)
	{
		this.sa = sa;
	}
	public SavingsAccount getSavingsAccount()
	{
		return sa;
	}

	public void setFixedAccount(FixedAccount fa)
	{
		this.fa = fa;
	}
	public FixedAccount getFixedAccount()
	{
		return fa;
	}
}

public class Assignment5
{
	public static void main(String[] args) 
	{
		SavingsAccount ss = new SavingsAccount();
		ss.setAccountNo("00000080");
        ss.setBalance(5000.0);
        ss.setInterestRate(0.90);

        FixedAccount ff = new FixedAccount();
        ff.setAccountNo("00000090");
        ff.setBalance(50000.0);
        ff.setTenureYear(2020);

        Customer cc = new Customer();
        cc.setNid(11111111);
        cc.setName("Mr.X");
        cc.setSavingsAccount(ss);
        cc.setFixedAccount(ff);


        System.out.println("_______________________________________________________________________________________________________________________________________\n");
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ First Customer Information  ------------------------------\n");
        System.out.println("               Customer NID           : " +cc.getNid());
        System.out.println("               Cistomer Name          : " +cc.getName());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Savings Account Information ------------------------------\n");
        System.out.println("               Savings Account Name   : " +cc.getSavingsAccount().getAccountNo());
        System.out.println("               Account Balance        : " +cc.getSavingsAccount().getBalance());
        System.out.println("               Interest Rate          : " +cc.getSavingsAccount().getInterestRate());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Fixed Account Information   ------------------------------\n");
        System.out.println("               Account Number         : " +cc.getFixedAccount().getAccountNo());
        System.out.println("               Account Balance        : " +cc.getFixedAccount().getBalance());
        System.out.println("               Tenure Per Year        : " +cc.getFixedAccount().getTenureYear());
        System.out.println("_______________________________________________________________________________________________________________________________________\n");
	

		SavingsAccount sss = new SavingsAccount();
		sss.setAccountNo("00000011");
        sss.setBalance(1000000.0);
        sss.setInterestRate(0.80);

        FixedAccount fff = new FixedAccount();
        fff.setAccountNo("00000012");
        fff.setBalance(200000000.0);
        fff.setTenureYear(2020);

        Customer ccc = new Customer();
        ccc.setNid(88888888);
        ccc.setName("Mr.Y");

        ccc.setSavingsAccount(sss);
        ccc.setFixedAccount(fff);

        System.out.println("                              ------------------------------ Second Customer Information ------------------------------\n");
        System.out.println("               Customer NID           : " +ccc.getNid());
        System.out.println("               Customer Name          : " +ccc.getName());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Savings Account Information ------------------------------\n");
        System.out.println("               Account Number         : " +ccc.getSavingsAccount().getAccountNo());
        System.out.println("               Balance Amount         : " +ccc.getSavingsAccount().getBalance());
        System.out.println("               Interest Rate          : " +ccc.getSavingsAccount().getInterestRate());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Fixed Account Information    -----------------------------\n");
        System.out.println("               Account Number         : " +ccc.getFixedAccount().getAccountNo());
        System.out.println("               Account Balance        : " +ccc.getFixedAccount().getBalance());
        System.out.println("               Tenure Per Year        : " +ccc.getFixedAccount().getTenureYear());
        System.out.println("_______________________________________________________________________________________________________________________________________\n");


        SavingsAccount ssss = new SavingsAccount();
        ssss.setAccountNo("00000013");
        ssss.setBalance(1600000.0);
        ssss.setInterestRate(0.70);

        FixedAccount ffff = new FixedAccount();
        ffff.setAccountNo("00000014");
        ffff.setBalance(205500000.0);
        ffff.setTenureYear(2020);

        Customer cccc = new Customer();
        cccc.setNid(99999999);
        cccc.setName("Mr.Z");

        cccc.setSavingsAccount(ssss);
        cccc.setFixedAccount(ffff);

        System.out.println("                              ------------------------------ Third Customer Information  ------------------------------\n");
        System.out.println("               Customer NID           : " +cccc.getNid());
        System.out.println("               Customer Name          : " +cccc.getName());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Savings Account Information ------------------------------\n");
        System.out.println("               Account Number         : " +cccc.getSavingsAccount().getAccountNo());
        System.out.println("               Balance Amount         : " +cccc.getSavingsAccount().getBalance());
        System.out.println("               Interest Rate          : " +cccc.getSavingsAccount().getInterestRate());
        System.out.println("                                                                                           ");
        System.out.println("                              ------------------------------ Fixed Account Information    -----------------------------\n");
        System.out.println("               Account Number         : " +cccc.getFixedAccount().getAccountNo());
        System.out.println("               Account Balance        : " +cccc.getFixedAccount().getBalance());
        System.out.println("               Tenure Per Year        : " +cccc.getFixedAccount().getTenureYear());
        System.out.println("_______________________________________________________________________________________________________________________________________\n");
	}
}