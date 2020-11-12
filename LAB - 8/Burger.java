
class Burger extends FoodItem
{
	private int numberofPatties;

	public Burger(double p, String n, int np)
	{
		super(n,p);
		numberofPatties = np;
	}

	public void showBurger()
	{
		showDetails();
		System.out.println("Number of patties : "+numberofPatties);
	}
}