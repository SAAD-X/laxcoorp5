import java.util.Scanner;

class Student
{
	private String name;
	private String id;
	private String subject;
	private String gendar;
	private String email;
	private String cgpa;

	public void setName(String n)
	{
		this.name = n;
	}
	public String getName()
	{
		return this.name;
	}

	public void setID(String d)
	{
		this.id = d;
	}
	public String getID()
	{
		return this.id;
	}

	public void setSubject(String s)
	{
		this.subject = s;
	}
	public String getSubject()
	{
		return this.subject;
	}

	public void setGendar(String g)
	{
		this.gendar = g;
	}
	public String getGendar()
	{
		return this.gendar;
	}

	public void setEmail(String e)
	{
		this.email = e;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setCGPA(String c)
	{
		this.cgpa = c;
	}
	public String getCGPA()
	{
		return this.cgpa;
	}
	public void show(int i)
	{
		System.out.println("This is the show function for student" + i);
	}
}

public class ArrayOfObjects
{
	 public static void main(String[] args)
    {
		Student arrayOfStudents[] = new Student[3];
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		arrayOfStudents[0] =s1;
		arrayOfStudents[1] =s2;
		arrayOfStudents[2] =s3;


		System.out.println("First Student's name: ");
		Scanner n1 = new Scanner(System.in);
		String name = n1.nextLine();
		arrayOfStudents[0].setName(name);
		System.out.println("First Student's id: ");
		String id = n1.nextLine();
		arrayOfStudents[0].setID(id);
		System.out.println("First Student's subject: ");
		String subject = n1.nextLine();
		arrayOfStudents[0].setSubject(subject);
		System.out.println("First Student's gendar: ");
		String gendar = n1.nextLine();
		arrayOfStudents[0].setGendar(gendar);
		System.out.println("Student's email: ");
		String email = n1.nextLine();
		arrayOfStudents[0].setEmail(email);
		System.out.println("First Student's cgpa: ");
		String cgpa = n1.nextLine();
		arrayOfStudents[0].setCGPA(cgpa);



		System.out.println("Second Student's name: ");
	    name = n1.nextLine();
		arrayOfStudents[1].setName(name);
		System.out.println("Second Student's id: ");
		id = n1.nextLine();
		arrayOfStudents[1].setID(id);
		System.out.println("Second Student's subject: ");
		subject = n1.nextLine();
		arrayOfStudents[1].setSubject(subject);
		System.out.println("Second Student's gendar: ");
		gendar = n1.nextLine();
		arrayOfStudents[1].setGendar(gendar);
		System.out.println("Second Student's email: ");
		email = n1.nextLine();
		arrayOfStudents[1].setEmail(email);
		System.out.println("Second Student's cgpa: ");
		cgpa = n1.nextLine();
		arrayOfStudents[1].setCGPA(cgpa);


		System.out.println("Third Student's name: ");
	    name = n1.nextLine();
		arrayOfStudents[2].setName(name);
		System.out.println("Third Student's id: ");
		id = n1.nextLine();
		arrayOfStudents[2].setID(id);
		System.out.println("Third Student's subject: ");
		subject = n1.nextLine();
		arrayOfStudents[2].setSubject(subject);
		System.out.println("Third Student's gendar: ");
		gendar = n1.nextLine();
		arrayOfStudents[2].setGendar(gendar);
		System.out.println("Third Student's email: ");
		email = n1.nextLine();
		arrayOfStudents[2].setEmail(email);
		System.out.println("Third Student's cgpa: ");
		cgpa = n1.nextLine();
		arrayOfStudents[2].setCGPA(cgpa);


		arrayOfStudents[0].show(1);
		arrayOfStudents[1].show(2);
		arrayOfStudents[2].show(3);

		
		System.out.println("                                                             ");
		System.out.println("_______________________________________________________");


		System.out.println("First Student's Name      : " +arrayOfStudents[0].getName());
		System.out.println("First Student's ID        : " +arrayOfStudents[0].getID());
		System.out.println("First Student's Subject   : " +arrayOfStudents[0].getSubject());
		System.out.println("First Student's Gendar    : " +arrayOfStudents[0].getGendar());
		System.out.println("First Student's Email     : " +arrayOfStudents[0].getEmail());
		System.out.println("First Student's CGPA      : " +arrayOfStudents[0].getCGPA());
		

		System.out.println("                                                             ");
		System.out.println("_______________________________________________________");

		
		System.out.println("Second Student's Name     : " +arrayOfStudents[1].getName());
		System.out.println("Second Student's ID       : " +arrayOfStudents[1].getID());
		System.out.println("Second Student's Subject  : " +arrayOfStudents[1].getSubject());
		System.out.println("Second Student's Gendar   : " +arrayOfStudents[1].getGendar());
		System.out.println("Second Student's Email    : " +arrayOfStudents[1].getEmail());
		System.out.println("Second Student's CGPA     : " +arrayOfStudents[1].getCGPA());
		

		System.out.println("                                                             ");
		System.out.println("_______________________________________________________");

		
		System.out.println("Third Student's Name      : " +arrayOfStudents[2].getName());
		System.out.println("Third Student's ID        : " +arrayOfStudents[2].getID());
		System.out.println("Third Student's Subject   : " +arrayOfStudents[2].getSubject());
		System.out.println("Third Student's Gendar    : " +arrayOfStudents[2].getGendar());
		System.out.println("Third Student's Email     : " +arrayOfStudents[2].getEmail());
		System.out.println("Third Student's CGPA      : " +arrayOfStudents[2].getCGPA());

		System.out.println("_______________________________________________________");
	}
}
