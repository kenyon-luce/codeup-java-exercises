package util;

import java.util.Scanner;

//class
public class Input {
    //instance variable
    Scanner sc = new Scanner(System.in);

    //instance methods
    public String getString(){
        //because we are creating an instance to an already defined instance type (scanner), we do not need the "static" keyword
        return sc.nextLine();
    }

    //TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo(){
        //because we are creating an instance to an already defined instance type (scanner), we do not need the "static" keyword
        String input = sc.next();
        if(input.startsWith("y")){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //TODO: The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
//    public int getInt(int min, int max){
//        min = 1;
//        max = 10;
//    };
//
//    public static int getInt(){
//        return;
//    };

    //TODO: The getDouble method should do the same thing, but with decimal numbers.
//    public static double getDouble(double min, double max){
//        min = 3.14;
//        max = 31.4;
//    };
//
//    public static double getDouble(){
//        return;
//    }

    //TODO: Create another class named InputTest that has a static main method that uses all the methods from the Input class.
}
