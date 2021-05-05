import java.util.Scanner;

public class Person {

    private String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Person kenyon = new Person("Kenyon Luce");
//        kenyon.sayHello();

        while(true) {
            System.out.println("What is your name?");
            String input = sc.next();
            Person user = new Person(input);
            user.sayHello();
            System.out.println();
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + getName() + "!");
    }
}
