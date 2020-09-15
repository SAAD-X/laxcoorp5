//Creating Fish class that extends Animal and implements Pet. 
public class Fish extends Animal implements Pet
{
    public String name;
    public Fish()
    {
        //Passing the value using super function
        super(0);
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
        System.out.println();
        System.out.println("+ Fish playing with fishes.");
    }   
   //Abstract Method Eat
    public void eat()
    {
        System.out.println("+ Fishes like to eat, i don't know. Do i live with them?");
        
    }
    //Regular Method
    public void walk()
    {
        System.out.println("+ Are you lost your sense? How can a fish walk? It has "+this.legs+" legs dude.");
        System.out.println();
    }
    

}
