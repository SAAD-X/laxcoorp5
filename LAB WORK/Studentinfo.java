public class Studentinfo
{
	private String Name;
	private String ID;
	private String Depertment;
	private String CGPA;

	public String getName() 
	{
		return Name;
	}
			
	public void setName(String name)
	{
		this.Name = name;
	}

	public String getID() 
	{
		return ID;
	}
			
	public void setID(String iD)
	{
		this.ID = iD;
	}

	public String getDepertment()
	{
		return Depertment;
	}
	public void setDepertment(String depertment)
	{
		this.Depertment = depertment;
	}
	public String getCGPA()
	{
		return CGPA;
	}
	public void setCGPA(String cgpa)
	{
		this.CGPA = cgpa;
	}

	public Studentinfo(String n,String i,String d,String c )
	{
		this.Name=n;
		this.ID=i;
		this.Depertment=d;
		this.CGPA=c;
	}
	
	public void showstudentinfo()
	{
		System.out.println("Student Name       : "+Name);
		System.out.println("Student ID         : "+ID);
		System.out.println("Student Depertment : "+Depertment);
		System.out.println("Student CGPA       : "+CGPA);
	}
	public static void main(String[] args) 
	{
			Studentinfo student = new Studentinfo("Rakin Sad Aftab","20-41991-1","CSE","4.00");

			
			student1.showstudentinfo();
	}
}