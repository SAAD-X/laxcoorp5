class Person
{
	private int Nidnum;
	private String Name;
	private String DateOfBirth;
	private String Nationality;
	private String EduLevel;
	private String BloodGroup;
	private String Gender;
	private int AccountNum;
	
	public Person(int n, String name, String dob, String nt, String E, String B, String g, int A)
	{
		Nidnum = n;
		Name = name;
		DateOfBirth = dob;
		Nationality = nt;
		EduLevel = E;
		BloodGroup = B;
		Gender = g;
		AccountNum = A;
	}
	
	public void DisplayPerson()
	{
		System.out.println("                                        ");
		System.out.println("NID Number                    :"+Nidnum);
		System.out.println("Employee's Name               :"+Name);
		System.out.println("Date of Birth                 :"+DateOfBirth);
		System.out.println("Nationality                   :"+Nationality);
		System.out.println("Education level               :"+EduLevel);
		System.out.println("Blood Group                   :"+BloodGroup);
		System.out.println("Employee Gender               :"+Gender);
		System.out.println("Account Number                :"+AccountNum);	
	}
}

class Employee extends Person
{
	private String EmployeeId;
	private String DateOfJoin;
	private double Salary;
	
	public Employee(int nid, String N, String dob, String Nt, String E, String B, String g, int A, String EI, String dj, double S)
	{
		super(nid, N, dob, Nt, E, B, g, A);
		EmployeeId = EI;
		DateOfJoin = dj;
		Salary = S;
	}
	
	public void DisplayEmployee()
	{
		DisplayPerson();
		System.out.println("Employee's Id                 :"+EmployeeId);
		System.out.println("Employee's Joining date       :"+DateOfJoin);
		System.out.println("Employee's Salary             :"+Salary);
	}
}

class Employer extends Person
{
	private String EmployerId;
	private double Revenue;
	
	public Employer(int nid, String N, String dob, String Nt, String E, String B, String g, int A, String EI, double R)
	{
		super(nid, N, dob, Nt, E, B, g, A);
		EmployerId = EI;
		Revenue = R;
	}
	
	public void DisplayEmployer()
	{
		DisplayPerson();
		System.out.println("Employee's Id                 :"+EmployerId);
		System.out.println("Employee's Revenue            :"+Revenue);
	}
}

class Programmer extends Employee
{
	private double Bonus;
	private String Skills;
	
	public Programmer(int nid, String N, String dob, String Nt, String E, String B, String g, int A, String EI, String doj, double S, double Boon, String Ss)
	{
		super(nid, N, dob, Nt, E, B, g, A, EI, doj, S);
		Bonus = Boon;
		Skills = Ss;
	}
	
	public void DisplayProgrammer()
	{
		DisplayEmployee();
		System.out.println("Bonus                         :"+Bonus);
		System.out.println("Skills                        :"+Skills);
	}
}

class Tester extends Employee
{
	private double Bonus;
	private String Skills;
	
	public Tester(int nid, String N, String dob, String Nt, String E, String B, String g, int A, String EI, String doj, double S, double Bon, String Ssi)
	{
		super(nid, N, dob, Nt, E, B, g, A, EI, doj, S);
		Bonus = Bon;
		Skills = Ssi;
	}
	
	public void DisplayTester()
	{
		DisplayEmployee();
		
		System.out.println("Tester bonus                  :"+Bonus);
		System.out.println("Tester Skills                 :"+Skills);
	}
}


public class YouJustYou
{
	public static void main(String [] args)
	{	
		//Creating objects 'mrx'
		//NID Number , Name , Date Of Birth , Nationality , Education , Blood group , Gender , Account Number , Employee ID, Employee Revenue
		Employer mrx = new Employer(11111, "MR. X", "01.01.2001", "Uganda", "Teacher", "O(-ve)", "Male", 45, "78", 50000);


		//Creating objects 'mry'
		//NID Number , Name , Date Of Birth , Nationality , Education , Blood group , Gender , Account Number , Employee ID, Joining Date, Salary , Bonus , Skill in
		Programmer mry = new Programmer(22222, "MR. Y", "02.02.2002", "Uganda", "Deveoper", "AB(-ve)", "Female", 34, "79", "05.10.2016", 20000, 1000, "Physics");


		//Creating objects 'mrz'
		//NID Number , Name , Date Of Birth , Nationality , Education , Blood group , Gender , Account Number , Employee ID, Joining Date, Salary , Bonus , Skill in
		Tester mrz = new Tester(33333, "MR.Z", "05.04.2001", "Uganda", "Analizer", "A(-ve)", "Female", 74, "80", "05.10.2016", 20000, 1000, "Chemistry");

		//Calling Employer Constructor
		mrx.DisplayEmployer();

		//Calling Programmer Constructor
		mry.DisplayProgrammer();

		//Calling Tester Constructor
		mrz.DisplayTester();
				
	}		
}
