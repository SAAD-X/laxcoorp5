import java.util.Scanner;

class Student
{
	private String name;
	private String fathername;
	private String mothername;
	private String dob;
	private String address;
	private String ID;
	private String depertment;
	private String email;
	private String phonenumber;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getFatherName()
	{
		return fathername;
	}
	public void setFatherName(String fathername)
	{
		this.fathername = fathername;
	}

	public String getMotherName()
	{
		return mothername;
	}
	public void setMotherName(String mothername)
	{
		this.mothername = mothername;
	}

	public String getDoB()
	{
		return dob;
	}
	public void setDoB(String dob)
	{
		this.dob = dob;
	}

	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getID()
	{
		return ID;
	}
	public void setID(String ID)
	{
		this.ID = ID;
	}

	public String getDepertment()
	{
		return depertment;
	}
	public void setDepertment(String depertment)
	{
		this.depertment = depertment;
	}

	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneNumber()
	{
		return phonenumber;
	}
	public void setPhoneNumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public void ShowStudentInfo(int i)
	{
		System.out.println("Student "+i+" Details");
		System.out.println("Student Name           : " +name);
		System.out.println("Father's Name          : " +fathername);
		System.out.println("Mother's Name          : " +mothername);
		System.out.println("Date Of Birth          : " +dob);
		System.out.println("Address                : " +address);
		System.out.println("Student's ID           : " +ID);
		System.out.println("Depertment             : " +depertment);
		System.out.println("Email Address          : " +email);
		System.out.println("Student's Phone Number : " +phonenumber);
	}
}
public class Student
{

	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);

		Student arrayOfStudends[] = new Student[1];
		Student std1 = new Student();

		arrayOfStudends[0] = std1;

		System.out.println("Student Name: ");
		String name = n1.nextLine();
		arrayOfStudends[0].setName(name);

		System.out.println("Father's Name: ");
		String fathername = n1.nextLine();
		arrayOfStudends[0].setFatherName(fathername);

		System.out.println("Mother's Name: ");
		String mothername = n1.nextLine();
		arrayOfStudends[0].setMotherName(mothername);

		System.out.println("Date Of Birth: ");
		String dob = n1.nextLine();
		arrayOfStudends[0].setDoB(dob);

		System.out.println("Address: ");
		String address = n1.nextLine();
		arrayOfStudends[0].setAddress(address);

		System.out.println("Student's ID: ");
		String ID = n1.nextLine();
		arrayOfStudends[0].setID(ID);

		System.out.println("Depertment: ");
		String depertment = n1.nextLine();
		arrayOfStudends[0].setDepertment(depertment);

		System.out.println("Email Address: ");
		String email = n1.nextLine();
		arrayOfStudends[0].setEmail(email);

		System.out.println("Student's Phone Number: ");
		String phonenumber = n1.nextLine();
		arrayOfStudends[0].setPhoneNumber(phonenumber);


		arrayOfStudends[0].ShowStudentInfo(1);
	}
}
