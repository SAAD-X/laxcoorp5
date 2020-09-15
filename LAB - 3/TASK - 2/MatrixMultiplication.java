import java.util.Scanner;
 
public class MatrixMultiplication
{
  
  
    private int first[][];
    private  int second[][];
    private int m, q, r , sum=0;
    
    Scanner input= new Scanner(System.in);
 
    public void setFirst(int a ,int b)
    {   
        first= new int[a][b];
        m=a;
        r=b;
       // Scanner input= new Scanner(System.in);
        System.out.println("Enter eliment of first matrix");
        for(int i=0;i<a;i++)
        {
            for(int i2=0;i2<b;i2++)
            {
                first[i][i2]= input.nextInt();
            }
        }
    }
    public void setSecond(int a ,int b)
    {
       second= new int[a][b];
        q=b;
       //  Scanner input= new Scanner(System.in);
        System.out.println("Enter the eliment of of second matrix");
        for(int i=0;i<a;i++)
        {
            for(int i2=0;i2<b;i2++)
            {
                second[i][i2]= input.nextInt();
            }
        }
    }
     
     public void Multiplication()
     {
        int multiply[][] = new int[m][q];
        
        for (int i1 = 0; i1 < m; i1++)
        {
        for (int i2 = 0; i2 < q; i2++) 
        {
          for (int i3 = 0; i3 < r; i3++){
          
            sum = sum + first[i1][i3]*second[i3][i2];
          }
 
          multiply[i1][i2] = sum;
          sum=0;
     
        }
      }
System.out.print("Multiplication is\n");
      for (int i = 0; i < m; i++) {
        for ( int i2 = 0; i2 < q; i2++){
          System.out.print(multiply[i][i2]+"\t");
 
          
        }
          System.out.print("\n");
      
     }
     }
     
 
 
      
}