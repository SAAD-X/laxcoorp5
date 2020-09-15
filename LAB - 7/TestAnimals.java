//Main class
public class TestAnimals{
    public static void main(String[] args)
    {
    //creating pet class object to call cat    
    Pet p = new Cat();
    //setting Fish name
    Fish d = new Fish();
    System.out.println();
    System.out.println("----------------- Fish Info -----------------");
    d.setName("Mr. Fish.");
    System.out.println("Fish Name is: "+d.getName());
    //calling interface
    d.play();
    //calling abstruct method
    d.eat();
    //creating Animal class object to call Fish   
    Animal a = new Fish();
    //calling regular method
    a.walk();
    
    //setting cat name
    Cat c = new Cat("Fluffy.");
    System.out.println("----------------- Cat Info  -----------------");
    System.out.println("Cat Name is: "+c.getName());
    //calling regular method
    c.walk();
    //calling interface
    c.play();
    //calling abstruct method
    c.eat();
    
    //creating Animal class object to call Spider   
    Animal e = new Spider();
    //calling regular method
    e.walk();
    //calling abstruct method
    e.eat();
 
    }
}