package practise;

import java.util.Scanner;

public class practise8 {
	public static void main(String[]args)
	{
		Scanner go = new Scanner(System.in);
		
		int n;
		String name;
		
		System.out.println("Enter code: ");
		n = go.nextInt();
		
		System.out.println("Enter name: ");
		name = go.next();
		
		switch (n)
		{
			case 1:
				System.out.println("Hello " + name);
				System.out.println("Hope you are well.");
		}
		
	}
}