package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {

        Student leo = new Student("Leonardo");
        leo.addGrade(100);
        leo.addGrade(85);
        leo.addGrade(95);

        Student raph = new Student("Raphael");
        raph.addGrade(63);
        raph.addGrade(50);
        raph.addGrade(25);

        Student mikey = new Student("Michelangelo");
        mikey.addGrade(70);
        mikey.addGrade(85);
        mikey.addGrade(80);

        Student donnie = new Student("Donatello");
        donnie.addGrade(100);
        donnie.addGrade(100);
        donnie.addGrade(101);

        Map<String, Student> students = new HashMap<>();
        students.put("leo", leo);
        students.put("xXshreddermasherXx", raph);
        students.put("cowaMIKEY", mikey);
        students.put("d0nn13.exe", donnie);
//        System.out.println(students);

        do {
            System.out.println();

            String[] listOfKeys = students.keySet().toArray(new String[0]); //created a list that will contain all our keys
            for (String key : listOfKeys) { //iterate through listOfKeys to print keys
                System.out.println(key);
            }
            //seems like the usernames were sorted automatically

            System.out.println();
            System.out.println("Which student would you like to see more information on?");
            Scanner sc = new Scanner(System.in);

            String input = sc.next();
            //if the input string equals a key, display the value of that key
            //might need another loop iteration
            //nvm we don't lol
            Student output = students.get(input); //grabs student object depending on input

            //System.out.println(output); //returns null when input doesn't match username, catch this before getting grade so we don't get an error
            //display message and continue when input does not match
            if(output != null){
                System.out.printf(
                        "%s - Github Username: %s\n" + //name and username (input)
                        "Current Average: %.2f\n" // grade
                ,output.getName(), input, output.getGradeAverage());
            } else {
                System.out.println("No users with that username were found");
            }
        } while (Input.yesNo()); //method grabbed from Input.java (imported up top)
        System.out.println("See ya");
    }
}
