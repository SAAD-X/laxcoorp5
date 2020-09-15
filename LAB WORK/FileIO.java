import java.lang.*;
import java.util.*;
import java.io.*;

class FileReadWrite
{
	private File f;
	private FileWriter fw;
	private FileReader fr;
	private BufferedReader bf;

	public void WriteFile(String s)
	{
		try
		{
			f = new File("Soldierinfo.txt");
			f.createNewFile();

			fw = new FileWriter(f, true);
      		fw.write(s+"\r"+"\n");
      		
     		fw.flush();         
     	 	fw.close();
		}

		catch(IOException ioe)
    	{
      		ioe.printStackTrace();
    	}
	}

	public void readFromFile()
	{
		try
		{
			fr = new FileReader(f);
			bf = new BufferedReader(fr);
			String text="", temp;

			while((temp = bf .readLine())!=null)
			{
				text=text+temp+"\n"+"\r";
			}

			System.out.println(text);
			fr.close(); 	
		}

		catch(IOException ioe)
    	{
     		 ioe.printStackTrace();
   		}
	}
}

public class FileIO extends FileReadWrite{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    FileReadWrite frwd = new FileReadWrite();

    System.out.println("Enter your name:");
    String s = sc.nextLine();
    frwd.WriteFile(s);

    System.out.println("Data below appreared from the file:");
    frwd.readFromFile();

  }
}
