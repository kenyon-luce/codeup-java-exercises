import java.util.Scanner;

public class Person {

    private String name;

    public static void main(String[] args){
        Person kenyon = new Person("Kenyon Luce");
        //^refers to the below constructor
        System.out.println(kenyon.getName());
        //don't need to log the functions since they just update the name
        kenyon.sayHello();
        kenyon.setName("not kenyon");
        kenyon.sayHello();
        //we can do this with more people as well
    }

    //constructor allows us to to create a new person
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName() + "!");
    }
}
