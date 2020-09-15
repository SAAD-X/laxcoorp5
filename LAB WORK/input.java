import java.util.Scanner;

class Product
{
	private String productname;
	private int productcode;
	private int quantity;
	protected float productprize;

	public String getProductName()
	{
		return productname;
	}
	public void setProductName(String productname)
	{
		this.productname = productname;
	}

	public int getQuatity()
	{
		return quantity;
	}
	public void setQuatity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getProductCode()
	{
		return productcode;
	}
	public void setProductCode(int productcode)
	{
		this.productcode = productcode;
	}

	public float getProductPrize()
	{
		return productprize;
	}
	public void setProductPrize(float productprize)
	{
		this.productprize = productprize;
	}

	public void ShowProductInfo()
	{
		//System.out.println("Product Name     : " +productname);
		//System.out.println("Product Code     : " +productcode);
		//System.out.println("Product Quantity : " +quantity);
		//System.out.println("Product Prize    : " +productprize);
	}

	public void show(int i)
	{
		System.out.println("This is the show function for product" + i);
	}
}
public class input
{
	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);

		Product arrayOfProducts[] = new Product[1];
		Product p1 = new Product();

		arrayOfProducts[0] =p1;

		System.out.println("Product Name: ");
		String productname = n1.nextLine();
		arrayOfProducts[0].setProductName(productname);

		System.out.println("Product Code: ");
		int productcode = n1.nextInt();
		arrayOfProducts[0].setProductCode(productcode);

		System.out.println("Product Quantity: ");
		int quantity = n1.nextInt();
		arrayOfProducts[0].setQuatity(quantity);

        System.out.println("Product Prize: ");
		float productprize = n1.nextFloat();
		arrayOfProducts[0].setProductPrize(productprize);

		arrayOfProducts[0].show(1);


		System.out.println("Product Name      : " +arrayOfProducts[0].getProductName());
		System.out.println("Product Code      : " +arrayOfProducts[0].getProductCode());
		System.out.println("Product Quantity  : " +arrayOfProducts[0].getQuatity());
		System.out.println("Product Prize     : " +arrayOfProducts[0].getProductPrize());
	}
}