
class Pizza extends FoodItem
{
	private String size;

	public Pizza(double p, String n, String s)
	{
		super(n,p);
		size = s;
	}

	public void showPizza()
	{
		showDetails();
		System.out.println("Pizza Size: "+size);
	}
}