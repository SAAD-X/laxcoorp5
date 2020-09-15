import java.util.Scanner;

public class Practise13
{
	public static void main(String[] args) 
	{
		
	
	Scanner n1 = new Scanner(System.in);

	String productname;
	float productmainprize = 100;
	float salestax;
		float tax;
		float totalcost;
		float discount;
		float yoo , d , sellprize , t ,f,g,e, reveniue;

    System.out.println("Enter the Product Name:");
	productname = n1.nextLine();

	System.out.println("Enter the Product Cost:");
	sellprize = n1.nextFloat();

	System.out.println("Enter the Product TAX:");
	salestax = n1.nextFloat();

	System.out.println("Enter the Discount:");
	discount = n1.nextFloat();

	tax = productmainprize * salestax;
	yoo = sellprize * discount;
	totalcost = productmainprize + tax;
	t = sellprize - yoo; 
	d = t + tax;
	reveniue = t - productmainprize;
	System.out.println("--------------------------------------------------------------------------");
	System.out.println("                                                                                          ");
	System.out.println("Product Tax ------------------------------------------------:" +tax);
	System.out.println("                                                                                          ");
	System.out.println("Product Total Cost Iclnuding Tax (WithOut Discount) --------:" +totalcost);
	System.out.println("                                                                                          ");
	System.out.println("Discount ---------------------------------------------------:" +yoo);
	System.out.println("                                                                                          ");
	System.out.println("Total Prize With Discount ----------------------------------:" +t);
	System.out.println("                                                                                          ");
	System.out.println("Total Prize With Discount Including Govt VatTax ------------:" +d);
	System.out.println("                                                                                          ");
	System.out.println("Coustomer Will Pay You -------------------------------------:" +d);
	System.out.println("                                                                                          ");
	System.out.println("For Government ---------------------------------------------:" +tax);
	System.out.println("                                                                                          ");
	System.out.println("--------------------------------------------------------------------------");

	if(t > productmainprize)
	{
		System.out.println("                          Reveniue: "+reveniue);
	}
	else
	{
		System.out.println("Loss " +reveniue);

	}

   }
}