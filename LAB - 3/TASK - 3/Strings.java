public class Strings {


    public static void main(String[] args) {
        
    String s1 = "Hello java";
	String s2 = "Hi Java";
	String s3 = new String("Hello Java");
	String s4 = new String("Hi Java");

		
		System.out.println(s1.charAt(4));
        System.out.println(s1.indexOf('j'));
		System.out.println(s1.length());
    if(s1.equals(s2))
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}

        System.out.println(s2.substring(3,7));
		System.out.println(s1.concat(s2));
        System.out.println(s3.replace("H","J"));

		s3=s3.toUpperCase();

	    System.out.println(s3);

		s3=s3.toLowerCase();

        System.out.println(s3);
    if(s3.equals(s4))
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
                
       }
    }
