import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(1,2));
//        System.out.println(Subtraction(1,2));
//        System.out.println(Multiplication(1,2));
//        System.out.println(Division(1,2));
//        System.out.println(Modulus(1,2));
        String response;
        do {
            Scanner sc = new Scanner(System.in);
            int userInput = getInteger(1, 10);
            System.out.print("Continue? [Y/N] ");
            response = sc.next();
        } while (response.equalsIgnoreCase("Y"));
    }

    //EXERCISE 1
    public static double Addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double Multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static double Modulus(double num1, double num2) {
        return num1 % num2;
    }

    //EXERCISE 2
    public static int getInteger(int min, int max) {
        Scanner othersc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = othersc.nextInt();
        int factorial = 1;
        if (userInput >= min & userInput <= max) {
            //EXERCISE 3
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + userInput + " is: " + factorial);
            System.out.println("All done, thanks!");
            return userInput;
        } else {
            return getInteger(max, min);
            //^repeats the method if false
        }
//
    }

}
