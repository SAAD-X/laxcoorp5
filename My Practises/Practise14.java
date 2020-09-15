/*import java.util.Scanner;

public class Practise14
{
	public static void main(String[] args) 
	{
		
	Scanner n1 = new Scanner(System.in);

	int num1 , num2;

	System.out.println("Enrer the first digit: ");
	num1 = n1.nextInt();

	System.out.println("Enrer the second digit: ");
	num2 = n1.nextInt();

	System.out.println( num1 + " X " + num2 + " = " + num1*num2);

	}	
}*/
/*import java.util.Scanner;

public class Practise14
{
	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);

			int num1 , num2 , a;

	System.out.println("Enrer the first digit: ");
	num1 = n1.nextInt();

	System.out.println("Enrer the second digit: ");
	num2 = n1.nextInt();

	a = num1 - num2;

	System.out.println(num1 + " + " + num2 + " = " + num1+num2);
	System.out.println(num1 + " - " + num2 + " = " + a);
	System.out.println(num1 + " x " + num2 + " = " + num1*num2);
	System.out.println(num1 + " / " + num2 + " = " + num1/num2);
	System.out.println(num1 + " mod " + num2 + " = " + num1/num2);
	}
}*/
/*import java.util.Scanner;

public class Practise14
{
	public static void main(String[] args) 
	{
		
	Scanner n1 = new Scanner(System.in);

	int num1 ;

	System.out.println("Enrer the first digit: ");
	num1 = n1.nextInt();

	for ( int i = 1 ; i <=10 ; i++ ) 
	{
		System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
	}
}
}*/
/*public class Practise14
{
	public static void main(String[] args) {
		System.out.println("    J          A          V          V          A");
		System.out.println("    J         A A          V        V          A A");
		System.out.println("    J        A   A          V      V          A   A");
		System.out.println("J   J       A AAA A          V    V          A AAA A");
		System.out.println("J   J      A       A          V  V          A       A");
		System.out.println(" J J      A         A          VV          A         A");
	}
}*/
/*public class Practise14
{
	private static final double radius = 7.5;
	public static void main(String[] args) {
		

		double perimeter = 2 * Math.PI * radius;
		double area = radius * Math.PI * radius;

		System.out.println("Perimeter is: " +perimeter );
		System.out.println("Area is: " +area );
	}
}*/
import java.util.Scanner;
public class Practise14
{
	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);

		float width , height;

		System.out.println("Enter Width: ");
		width = n1.nextFloat();

		System.out.println("Enter Height: ");
		height = n1.nextFloat();

		float area = width*height;
		float perimeter = 2 * (width+height);

		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);

	}
}