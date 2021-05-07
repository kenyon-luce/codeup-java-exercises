import java.util.*;

public class CollectionsLecture {

    public static void printEachElement(List<String> strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        // ----------------------------- Array Lists

        // Creating Array Lists and Getting Elements

//        ArrayList<Integer> numbers = new ArrayList<>(); //this list will store Integers, numbers is just the name of the variable
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        System.out.println(numbers);
//
//        numbers.add(7); //added the number 7 to the numbers array (sort of like the push() method in Javascript)
//        System.out.println(numbers); // used to peek into the list
//        System.out.println(numbers.get(0)); //similar to indexOf


        ArrayList<String> strings = new ArrayList<>(); //created empty array and passed in the following 3 strings
        strings.add("bob");
        strings.add("hello");
        strings.add("etc");

        String hello = strings.get(1);
        System.out.println(hello.toUpperCase());
        System.out.println(strings);

        //TODO: write an array list of 3 people in this cohort and print each person in the list
        ArrayList<String> cohortMates = new ArrayList<>();
        cohortMates.add("Jake");
        cohortMates.add("Shanshan");
        cohortMates.add("Nic");

        System.out.println(cohortMates.get(0));
        System.out.println(cohortMates.get(1));
        System.out.println(cohortMates.get(2));

        // Creating ArrayList with Arrays.asList()

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//        //maybe we can concatenate into this array through this method
////
//        System.out.println(names);

        // Getting Elements by Index Number

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//
//        System.out.println(names.get(2));
//        System.out.println(names.get(5)); // ? returns exception (error) because it doesn't exist in this case


        // Adding & Editing Elements

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        numbers.add(20);
//        System.out.println(numbers);
//        numbers.add(0, 21); // expands the array size, adds 21 to index of 0 and shifting everything else by one index
//        System.out.println(numbers);
//        numbers.set(0, 7); // edits the value at that index, changed 21 to 7
//        System.out.println(numbers);
////        numbers.add(10, 22); // ??? exception (error) is out of bounds
//        System.out.println(numbers);
////
//        System.out.println(numbers.size()); //returns array.length


        // Removing Elements

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Fred",
                "Sally",
                "Cindy"
        ));
        System.out.println(names);
        names.remove(0); //removed "Fred"
        System.out.println(names);

        names.remove("Cindy"); //does same thing, removes Cindy
        System.out.println(names);

        // Removing Number by Value or Index

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        numbers.remove(2);
//        numbers.remove(Integer.valueOf(2)); // remove by value of the number
//        System.out.println(numbers);

        // reordering list
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
//        Collections.sort(numbers); //orders numbers from least to greatest
//        Collections.reverse(numbers); //reverses current order of the list
//        System.out.println(numbers);

        // Additional Methods

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(3)); //
//        System.out.println(numbers.indexOf(105)); // ???
//
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("medium");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts);
        System.out.println(roasts.contains("dark")); //returns boolean
        System.out.println(roasts.contains("espresso")); //returns boolean
        System.out.println(roasts.lastIndexOf("medium")); //returns the duplicate "medium" index location
        System.out.println(roasts.isEmpty()); //returns boolean if the array is empty

        /*

            TODO:
               1. Create a class called CollectionsPractice with a main method.
               2. Create a static method, upperLastElement, that takes in an array list and
                  returns the array list with last string capitalized. An empty array list
                  should be returned if the passed array list is empty. If the passed array
                  list only has one string, capitalize it.
               3. In the main method, create an array list of first name strings of three people in Marco.
               4. Test the upperLastElement method on your array of Marco people.

               Examples

               ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
               upperLastElement(names) should return "Justin", "Douglas", "KENNETH"

               ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
               upperLastElement(names2) should return "KENNETH"

               ArrayList<String> names3 = new ArrayList<>();
               upperLastElement(names3) should return an empty array list

         */

        // List vs. ArrayList (Polymorphism)

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("bob", "steve", "justin"));
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("bob", "steve", "justin"));
//
        printEachElement(linkedList); //in line 5 we changed ArrayList to List, it is a more generic way of accepting different list types


        // Java Generics

        List unsafe = new ArrayList();
        unsafe.add(new Object());
        unsafe.add(3);
        unsafe.add("hello");
        unsafe.add(true);

        System.out.println(unsafe); //returns array of different element types

        String str1 = (String) unsafe.get(2); // must explicitly cast (as in whatever you are trying to get you have to specify what type it is)
//        String str2 = (String) unsafe.get(0); // can lead to runtime exceptions
        System.out.println(str1);

        // ----------------------------- Hash Maps

        // creating hash maps

        Map<String, String> usernames = new HashMap<>(); //2 arguments for getting the key and value of entries (like parameters). creates key value pairs
        usernames.put("Ryan", "ryanorsinger"); //(name, username)
        usernames.put("Luis", "MontealegreLuis");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");
        System.out.println(usernames);

        // getting values from and info about hash map

//        System.out.println(usernames);
        System.out.println(usernames.get("Justin")); //returns value (jreich5)
        System.out.println(usernames.get("Phillip")); //returns null (non-existent)
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
//        System.out.println(usernames.containsKey("Luis"));

        // updating hash maps

        usernames.put("Ryan", "rorsinger"); //changed username
        System.out.println(usernames);
//        System.out.println(usernames);
//        usernames.put("Ryan", "Test");
//
//        usernames.putIfAbsent("Zach", "coderdude24");
//        System.out.println(usernames);
        usernames.replace("Ryan", "torvalds"); // same as put
        System.out.println(usernames);

        // removing pairs from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        System.out.println(usernames);
        usernames.clear(); //cleared out the object
        System.out.println(usernames);
        System.out.println(usernames.isEmpty());

        /*

            TODO: Create a HashMap of three people in class with keys using their last name
             and values at those keys using their first name.

             Example

             "Justin" could be returned from nameHashMap.get("Reich") */
             Map<String, String> nameHashMap = new HashMap<>();
             nameHashMap.put("Kenyon", "Luce");
             nameHashMap.put("Jake", "Chadwell");
             nameHashMap.put("Alex", "Avitia");

        System.out.println(nameHashMap.get("Luce"));


         /*   BONUS TODO: Create a HashMap containing three people in the class with keys using their
             first name and values that are an ArrayList of strings containing at least two
             objects visible in their background.

             Example

             ArrayList<String> with values ("Codeup Sign", "Black Background", "Nothing Else")
             from backgroundHashMap.get("Justin")

         */

    }

}