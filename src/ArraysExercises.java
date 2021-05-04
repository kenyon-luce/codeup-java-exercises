import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //^this only prints strings, to print the numbers array we need to convert it to a string

        Person[] people = new Person[3]; //(grabbed from Person.class) created new person and gave it a length of 3

//        Arrays[] container = new Arrays[3];
//        String[] people = {"person1", "person2", "person3"};
        people[0] = new Person("person1");
        people[1] = new Person("person2");
        people[2] = new Person("person3");

//        for(Person name : people ){
//            System.out.println(name);
//        }

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }
        Person kenyon = new Person("Kenyon");
        addPerson(people, kenyon);

        for (int i = 0; i < people.length + 1; i++) {
            System.out.println(addPerson(people, kenyon)[i].getName());
        }

//        System.out.print(Arrays.toString(people));
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[people.length - 1] = newPerson;
        return newPeople;
    }

}
