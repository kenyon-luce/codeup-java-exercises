import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //^this only prints strings, to print the numbers array we need to convert it to a string

        Person[] people = new Person[3]; //(grabbed from Person.class) created new person and gave it a length of 3

//        Arrays[] container = new Arrays[3];
//        String[] people = {"person1", "person2", "person3"};

        for(Person person : people ){
            System.out.println(person);
        }

        System.out.print(Arrays.toString(people));
    }
}
