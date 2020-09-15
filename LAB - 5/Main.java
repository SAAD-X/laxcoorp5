import java.lang.*;

public class Main 
{

    public static void main(String[] args) 
    {
        //                                            Setting & Printing The Velue for First Customer's Savings Account
        // Creating Object For Savings Account
        SavingsAccount ss = new SavingsAccount();
        // Setting The Velue for First Customer's Savings Account
        ss.setAccountNo("00000080");
        ss.setBalance(5000.0);
        ss.setInterestRate(0.90);
        // Creating Object For Fixed Account
        FixedAccount ff = new FixedAccount();
        // Setting The Velue for First Customer's Fixed Account
        ff.setAccountNo("00000090");
        ff.setBalance(50000.0);
        ff.setTenureYear(2020);
        // Creating Object For Customer
        Customer cc = new Customer();
        // Setting The Velue for First Customer
        cc.setNid(11111111);
        cc.setName("Mr.X");
        // Calling the Object Of SavingsAccount directly
        cc.setAccount(ss);
        // Calling the Object Of FixedAccount directly
        cc.setFixedAccount(ff);
        // Printing The Values Of First Customer , NID > Name > Savings Account Name > Account Balance > Interest Rate > Account Number  > Account Balance > Tenure Per Year.
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


        //                                            Setting & Printing The Velue for Second Customer's Savings Account
        // Creating Object For Savings Account
        SavingsAccount sss = new SavingsAccount();
        // Setting The Velue for Second Customer's Savings Account
        sss.setAccountNo("00000011");
        sss.setBalance(1000000.0);
        sss.setInterestRate(0.80);
        // Creating Object For Fixed Account
        FixedAccount fff = new FixedAccount();
        // Setting The Velue for Second Customer's Fixed Account
        fff.setAccountNo("00000012");
        fff.setBalance(200000000.0);
        fff.setTenureYear(2020);
        // Creating Object For Customer
        Customer ccc = new Customer();
        ccc.setNid(88888888);
        ccc.setName("Mr.Y");
        // Calling the Object Of SavingsAccount directly
        ccc.setAccount(sss);
        // Calling the Object Of FixedAccount directly
        ccc.setFixedAccount(fff);
        // Printing The Values Of First Customer , NID > Name > Savings Account Name > Account Balance > Interest Rate > Account Number  > Account Balance > Tenure Per Year.
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


        //                                            Setting & Printing The Velue for Third Customer's Savings Account
        // Creating Object For Savings Account
        SavingsAccount ssss = new SavingsAccount();
        // Setting The Velue for Third Customer's Savings Account
        ssss.setAccountNo("00000013");
        ssss.setBalance(1600000.0);
        ssss.setInterestRate(0.70);
        // Creating Object For Fixed Account
        FixedAccount ffff = new FixedAccount();
        // Setting The Velue for Third Customer's Fixed Account
        ffff.setAccountNo("00000014");
        ffff.setBalance(205500000.0);
        ffff.setTenureYear(2020);
        // Creating Object For Customer
        Customer cccc = new Customer();
        // Setting The Velue for First Customer
        cccc.setNid(99999999);
        cccc.setName("Mr.Z");
        // Calling the Object Of SavingsAccount directly
        cccc.setAccount(ssss);
        // Calling the Object Of FixedAccount directly
        cccc.setFixedAccount(ffff);
        // Printing The Values Of First Customer , NID > Name > Savings Account Name > Account Balance > Interest Rate > Account Number  > Account Balance > Tenure Per Year.
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
