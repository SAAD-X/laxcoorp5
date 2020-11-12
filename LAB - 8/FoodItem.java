
class FoodItem
{
	private double price;
	private String name;

	public FoodItem(String n, double p)
	{
		price = p;
		name = n;
	}

	public void showDetails()
	{
		System.out.println("Name  : "+name);
		System.out.println("Price : "+price);
	}
}