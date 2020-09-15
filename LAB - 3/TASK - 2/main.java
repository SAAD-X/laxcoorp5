import java.util.Scanner;
 
class main
{
  public static void main(String args[])
  {      int a,b,c,d;
         System.out.println("Enter the number of rows and columns of first matrix");
         Scanner input = new Scanner(System.in);
         a=input.nextInt();
         b=input.nextInt();
         System.out.println("Enter the number of rows and columns of first matrix");
         c=input.nextInt();
         d=input.nextInt();
         if(b!=c)
         {
             System.out.println("Error");
         }
         else
         {
             MatrixMultiplication m1= new MatrixMultiplication() ;
             m1.setFirst(a,b);
             m1.setSecond(c,d);
             m1.Multiplication();
         }   
  }
}