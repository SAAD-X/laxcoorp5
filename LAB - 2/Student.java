public class Student {
	
			private String ID;
			private String Name;
			private String Subject;
			private String Gender;
			private String Email;
			private float FinalSemesterGPA;
			private int FinalSemesterCreditsTaken;
			private float TotalCGPATillFinalSemester;
			private int CreditsCompletedTillFinalSemester;

			public String getID() 
			{
			return ID;
			}
			
			public void setID(String iD)
			{
			this.ID = iD;
			}
			
			public String getName() 
			{
			return Name;
			}
			
			public void setName(String name)
			{
			this.Name = name;
			}
			
			public String getSubject() 
			{
			return Subject;
			}
			
			public void setSubject(String subject) 
			{
			this.Subject = subject;
			}
			
			public String getGender() 
			{
			return Gender;
			}
			
			public void setGender(String gender) 
			{
			this.Gender = gender;
			}
			
			public String getEmail()
			{
			return Email;
			}
			
			public void setEmail(String email)
			{
			this.Email = email;
			}
			
			public float getFinalSemesterGPA()
			{
			return FinalSemesterGPA;
			}
			
			public void setFinalSemesterGPA(float finalSemesterGPA) 
			{
			this.FinalSemesterGPA = finalSemesterGPA;
			}
			
			public int getFinalSemesterCreditsTaken()
			{
			return FinalSemesterCreditsTaken;
			}
			
			public void setFinalSemesterCreditsTaken(int finalSemesterCreditsTaken) 
			{
			this.FinalSemesterCreditsTaken = finalSemesterCreditsTaken;
			}
			
			public float getTotalCGPATillFinalSemester() 
			{
			return TotalCGPATillFinalSemester;
			}
			
			public void setTotalCGPATillFinalSemester(float totalCGPATillFinalSemester) 
			{
			this.TotalCGPATillFinalSemester = totalCGPATillFinalSemester;
			}
			
			public int getCreditsCompletedTillFinalSemester() 
			{
			return CreditsCompletedTillFinalSemester;
			}
			
			public void setCreditsCompletedTillFinalSemester(int creditsCompletedTillFinalSemester)
			{
			this.CreditsCompletedTillFinalSemester = creditsCompletedTillFinalSemester;
			}

			public Student(String i,String n,String s,String g,String e,float fsg,int fsc,float tgtf,int cctf)
			    {
			    this.ID=i;
			    this.Name=n;
			    this.Subject=s;
			    this.Gender=g;
			    this.Email=e;
			    this.FinalSemesterGPA=fsg;
			    this.FinalSemesterCreditsTaken=fsc;
			    this.TotalCGPATillFinalSemester=tgtf;
			    this.CreditsCompletedTillFinalSemester=cctf;
			   
			    }

			public void ShowStudentInfo ()
			{
			System.out.println("!- STUDENT'S WHO WILL GOING TO CONVOCATION OR NOT -!");
			System.out.println("....................................................");
			System.out.println("__________________________________________________________________");
			System.out.println("Identity Number                       :"+ID);
			System.out.println("Name                                  :"+Name);
			System.out.println("Subject                               :"+Subject);
			System.out.println("Gender                                :"+Gender);
			System.out.println("Email                                 :"+Email);
			System.out.println("Final Semester CGPA                   :"+FinalSemesterGPA);
			System.out.println("Final Semester Credits Taken          :"+FinalSemesterCreditsTaken);
			System.out.println("Total CGPA Till Final Semester        :"+TotalCGPATillFinalSemester);
			System.out.println("Credits Completed Till Final Semester :"+CreditsCompletedTillFinalSemester);
			System.out.println("Total Completed Credits               :"+CalculateTotalCompletedCredits ());
			System.out.println("Final CGPA                            :"+CalculateFinalCGPA ());
			System.out.println("Student Status                        :"+CheckStudentStatus ());
			System.out.println("Graduation Eligibility Check          :"+GraduationEligibilityCheck ());
			System.out.println("______________________________________________________________________________________________________________________________________");
			}

			public int CalculateTotalCompletedCredits ()
			{
			
			int x;
			x=this.CreditsCompletedTillFinalSemester+this.FinalSemesterCreditsTaken;
			return x;
			}

			public float CalculateFinalCGPA ()
			{
			
			float y;
			
			y=(((this.TotalCGPATillFinalSemester*this.CreditsCompletedTillFinalSemester)+(this.FinalSemesterGPA*this.FinalSemesterCreditsTaken))
			/CalculateTotalCompletedCredits ());
			return y;
			}

			public String CheckStudentStatus ()
			{
			if(CalculateFinalCGPA ()<2.5)
			{
			    return "Probation";
			}
			else if(CalculateFinalCGPA ()>=2.5)
			{
			return "Regular";
			}
			else
			{
			return "Invalid CGPA";
			}
			}
			public boolean GraduationEligibilityCheck ()
			{
			boolean b1=true,b2=false;

			if(CalculateFinalCGPA () >= 2.5 && CalculateTotalCompletedCredits () >= 148)
			{
			return b1;
			}
			else
			{
			return b2;
			}
			}

			
		public static void main(String [] args)
		{
		Student student1=new Student("20-41991-1","Rakin Sad Aftab","CSE","Male","20-41991-1@student.aiub.edu",3.5f, 15, 3.6f, 133);
		Student student2=new Student("20-*****-1","X","CSE","Male","20-4****-1@student.aiub.edu",3.5f, 15, 3.6f, 133);
		student1.ShowStudentInfo () ;
		student2.ShowStudentInfo () ;
		}
		}