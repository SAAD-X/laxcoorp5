package practise;
import java.util.Scanner;
public class practise7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int day;
		
		System.out.println("Enter the day number: ");
		day = input.nextInt();
		
		if ( day == 1)
		{
			System.out.println("Today is Saturday.");
			System.out.println("Today is Abner Aftab's Birthday");
		}
		else if( day == 2)
		{
			System.out.println("Today is Sunday.");
			System.out.println("Today is Fatema Aftab's Birthday");
		}
		else if( day == 3)
		{
			System.out.println("Today is Monday.");
			System.out.println("Today is Arab Aftab's Birthday.");
		}
		else if( day == 4)
		{
			System.out.println("Today is Tuesday.");
			System.out.println("Today is Nushash Aftab's Birthday.");
		}
		else if( day == 5)
		{
			System.out.println("Today is Wednasday.");
			System.out.println("Today is Risha Aftab's Birthday.");
		}
		else if( day == 6)
		{
			System.out.println("Today is Thursday.");
			System.out.println("Today is Ayan Aftab's Birthday.");
		}
		else 
		{
			System.out.println("Today is Friday.");
			System.out.println("Today is Anisha Aftab's Birthday.");
		}
		
	}

}
