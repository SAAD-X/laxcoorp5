//abstract Class Animal
public abstract class Animal
{
    protected int legs;
    protected Animal(int legs)
    {
    this.legs=legs;
    }       
    //Abstract Method Eat
    public abstract void eat();

    //regular method
    public void walk()
    {
    	if(this.legs == 4)
	 	{
	 		System.out.println("                        						");
	 		System.out.println("+ The Cat is walking with " + this.legs + " legs.");
	 	}
	 	else if(this.legs == 8)
	 	{
	 		System.out.println("----------------- Spider Info ---------------");
	 		System.out.println("+ The Spider is walking with " + this.legs + " legs.");

	 	}
	 	else
	 	{
    	System.out.println("+ Are you lost your sense? How can a fish walk? It has "+this.legs+" legs dude.");
        System.out.println();
	 	}
    }
}

