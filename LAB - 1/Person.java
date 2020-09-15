
public class Person {

	public int id;
	public String name;
	
	public Person()
	{
		
	}
	public Person(int i, String n)
	{
		id = i ;
		name =n;
	}
	public void displayInfo()
	{
		System.out.println("Name is : " +name);
		System.out.println("ID is : " +id);
	}
	public static void main(String args[])
	 {
	Person p1=new      
	Person(10,"Messi");
	p1.displayInfo();
	Person p2=new
	Person(75,"Sakib");
	p2.displayInfo();
	Person p3=new
	Person(7,"Ranaldo");
	p3.displayInfo();
	 }

	}


