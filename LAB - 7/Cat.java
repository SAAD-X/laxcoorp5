//Creating Cat class that extends Animal and implements Pet. 
public class Cat extends Animal implements Pet
{
    private String name;
    public Cat(String name)
    {
        //Passing the value using super function
        super(4);
        this.name=name;
    }
    public Cat()
    {
        this("");
    }
    //gatter
    public String getName()
    {
        return name;
    }
    //setter
    public void setName(String name)
    {
        this.name=name;
    }
    //interface
    public void play()
    {
        System.out.println("+ Cats are playing with another cats.");         
    }
    //Abstract Method Eat
    public void eat()
    {
       System.out.println("+ The Cat likes to eat Fishes.");
       System.out.println();
    }           
}
