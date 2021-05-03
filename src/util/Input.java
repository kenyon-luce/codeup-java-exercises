package util;

import java.util.Scanner;

//class
public class Input {
    //instance variable (private)
    private static Scanner sc = new Scanner(System.in);

    //instance methods
    public static String getString(){
        //because we are creating an instance to an already defined instance type (scanner), we do not need the "static" keyword
        System.out.println("Give me a string");
        String string = sc.nextLine();
        System.out.println(string);
        return string;
    }

    //TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public static boolean yesNo(){
        //because we are creating an instance to an already defined instance type (scanner), we do not need the "static" keyword
        System.out.println("Continue?");
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
    public static int getInt(int min, int max) {
//        min = 1;
//        max = 10;
        int guess;
        do {
            System.out.println("Give me a number between " + min + " and " + max);
            guess = getInt();
//            guess = sc.nextInt();
        } while (guess > max | guess < min);
        System.out.println("Thanks!");
        return guess;
    }

    public static int getInt(){
        int input = sc.nextInt();
        return input;
    }

    //TODO: The getDouble method should do the same thing, but with decimal numbers.

    public static double getDouble(double min, double max) {
        //this method breaks if i input a decimal number
        System.out.println("Give me a decimal number between " + max + " and " + min);
        double guessDouble;
        do {
            guessDouble = getDouble();
        } while (guessDouble > max | guessDouble < min);
        System.out.println("Thanks!");
        return guessDouble;
    }

    public static double getDouble(){
        double inputDouble = sc.nextInt();
        return inputDouble;
    }

    //TODO: Create another class named InputTest that has a static main method that uses all the methods from the Input class.
}
