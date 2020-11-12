public class Start
{
	public static void main(String[] args) 
	{
		Pizza p = new Pizza(500,"Pizza" ,"5.2'");
		
		p.showPizza();
		
		System.out.println("");
		
		Burger b = new Burger(400,"Burger",2);
		
		b.showBurger();
	}
}