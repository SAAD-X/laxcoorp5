import java.util.Scanner;

public class practise12
{
	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);
		String name;
		int productcode;
		float productcost;
		float salestax;
		float tax;
		float totalcost;
		float discount;
		float yoo , d , t;


	System.out.println("Enter the Product Name:");
	name = n1.nextLine();

	System.out.println("Enter the Product Code:");
	productcode = n1.nextInt();

	System.out.println("Enter the Product Cost:");
	productcost = n1.nextFloat();

	System.out.println("Enter the Product TAX:");
	salestax = n1.nextFloat();

	System.out.println("Enter the Discount:");
	discount = n1.nextFloat();

	tax = productcost * salestax;
	totalcost = productcost + tax;
	yoo = totalcost - discount;
	d = totalcost - yoo;

	System.out.println("Product Tax:" +tax);
	System.out.println("Product Total Cost including Tax:" +totalcost);
	System.out.println("Discount :" +d);
	System.out.println("Total Prize with Discount:" +yoo);

	}


}