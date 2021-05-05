import java.util.Scanner;

public class Person {

    private String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person user = new Person("user");
        user.sayHello();

        System.out.println("What is your name?");
        String input = sc.next();
//        Person user = new Person(input);
        user.setName(input);
        user.sayHello();
        System.out.println();



        //**********TESTS**********
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane
        //set name changes the persons name with a new one, since person2 was set equal to person1, when we set the name for person2 to a new name, it updated person1s name too

        //**********END OF TESTS**********
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
