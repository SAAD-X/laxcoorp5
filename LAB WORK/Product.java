public class Product{

	private String name;
	private int id;
	private String category;
	private float pricePerPiece;
	private int quantity;
	//private float tax;

	Product(String n, int i, String c, float ppp, int q, float t){
		this.name = n;
		this.id = i;
		this.category = c;
		this.pricePerPiece = ppp;
		this.quantity = q;
		//this.tax = t;
	}

	public int totalOrder(int to){
		if (this.quantity >= to) {
			System.out.println("+_______________________________+");
			System.out.println("Order Received");
			System.out.println("You can purchase " + to + " pieces");
			return to;
		}
		else{
			System.out.println("out of stock!!!");
			return to;
		}

	}

	public void discount(int d){
		if (this.totalOrder(d) <= this.quantity) {
			if (5 <= d && d <= 10) {
			System.out.println("you will get 2 percent discount");
			System.out.println("discount: " + (this.pricePerPiece * 0.02));

			}
			else if (10 <= d) {
				System.out.println("you will get 5 percent discount");
				System.out.println("discount: " + (this.pricePerPiece * 0.05));
				System.out.println("+_______________________________+");
			}
			else{
				System.out.println("no discount!!!");
			}
		}
		else{
			System.out.println("out of stock!!!");
		}
		
	}

	public void revenue()
	 {
			double rev;
			rev = pricePerPiece * quantity;
			System.out.println("Sales Revenue: " +rev);
			System.out.println("+_______________________________+");
	 }

	void displayProductInfo()
	{
	 	System.out.println("Product Name: " +name);
	 	System.out.println("Product ID: " +id);
	 	System.out.println("Product Category: " +category);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Perfume", 111, "Cos", 200.50f, 50, 25.80f);
		p1.displayProductInfo();
		p1.discount(40);
		// p1.totalOrder(5);
		p1.revenue();
		
	}

}