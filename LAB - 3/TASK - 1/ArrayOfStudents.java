import java.util.Scanner;
 
class Student {
 
    public static int STUDENT_SIZE = 3;
 
    private String id;
    private String name;
    private String subject;
    private String gender;
    private String email;
    private float cgpa;
 
    public void setId(String id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
 
    public String getId() {
        return this.id;
    }
 
    public String getName() {
        return this.name;
    }
 
    public String getSubject() {
        return this.subject;
    }
 
    public String getGender() {
        return this.gender;
    }
 
    public String getEmail() {
        return this.email;
    }
 
    public float getCgpa() {
        return this.cgpa;
    }
 
    public void showStudentInfo() {
        System.out.println();
        System.out.println("# Student Information #");
        System.out.println("\tID        : " + this.id);
        System.out.println("\tName      : " + this.name);
        System.out.println("\tSubject   : " + this.subject);
        System.out.println("\tGender    : " + this.gender);
        System.out.println("\tEmail     : " + this.email);
        System.out.println("\tCGPA      : " + this.cgpa);
        System.out.println();
    }
}
 
class ArrayOfStudents {
 
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Student students[] = new Student[Student.STUDENT_SIZE];
 
        System.out.println("\n# Enter " + Student.STUDENT_SIZE + " Student Information #\n");
 
        for(int i = 0; i < Student.STUDENT_SIZE; i++) {
            System.out.println("Student " + (i + 1) + " :");
 
            students[i] = new Student();
 
            System.out.print("\tID: ");
            students[i].setId(inputs.nextLine());
 
            System.out.print("\tName: ");
            students[i].setName(inputs.nextLine());
 
            System.out.print("\tSubject: ");
            students[i].setSubject(inputs.nextLine());
 
            System.out.print("\tGender: ");
            students[i].setGender(inputs.nextLine());
 
            System.out.print("\tEmail: ");
            students[i].setEmail(inputs.nextLine());
 
            System.out.print("\tCGPA: ");
            students[i].setCgpa(inputs.nextFloat());
 
            inputs.nextLine();
        }
 
        for(Student student: students) {
            student.showStudentInfo();
        }
    }
}