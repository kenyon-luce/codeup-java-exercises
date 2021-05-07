package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        Student leo = new Student("Leonardo");
        leo.addGrade(100);
        leo.addGrade(85);
        leo.addGrade(95);
        leo.getGradeAverage();

        System.out.println();

        Student raph = new Student("Raphael");
        raph.addGrade(63);
        raph.addGrade(50);
        raph.addGrade(25);
        raph.getGradeAverage();

        System.out.println();

        Student mikey = new Student("Michelangelo");
        mikey.addGrade(70);
        mikey.addGrade(85);
        mikey.addGrade(80);
        mikey.getGradeAverage();

        System.out.println();

        Student donnie = new Student("Donatello");
        donnie.addGrade(100);
        donnie.addGrade(100);
        donnie.addGrade(101);
        donnie.getGradeAverage();

        Map<String, Student> students = new HashMap<>();
        students.put("leo", leo);
        students.put("xXshreddermasherXx", raph);
        students.put("cowaMIKEY", mikey);
        students.put("d0nn13.exe", donnie);

        System.out.println(students);
        System.out.println();

        String[] listOfKeys = students.keySet().toArray(new String[0]); //created a list that will contain all our keys
        for (String key : listOfKeys) { //iterate through listOfKeys to print keys
            System.out.println(key);
        }
        //seems like the usernames were sorted automatically

        System.out.println();
        System.out.println("Which student would you like to see more information about?");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        //if the input string equals a key, display the value of that key
        //might need loop iteration
        //nvm we don't lol
        Student output = students.get(input);
        output.getGradeAverage();
    }
}
