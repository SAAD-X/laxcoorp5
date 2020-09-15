//inheritance 
public class Spider extends Animal
{
    Spider()
    {
    	//Passing the value using super function
        super(8);
    }
    //Abstract Method Eat
    public void eat()
    {
        System.out.println("+ The spider eats small insects.");
    }

}
