import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
//        System.out.println(Addition(1,2));
//        System.out.println(Subtraction(1,2));
//        System.out.println(Multiplication(1,2));
//        System.out.println(Division(1,2));
//        System.out.println(Modulus(1,2));
        getInteger(1, 10);
    }

    //EXERCISE 1
    public static double Addition(double num1, double num2){
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double Multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double Division(double num1, double num2){
        return num1 / num2;
    }

    public static double Modulus(double num1, double num2){
        return num1 % num2;
    }

    //EXERCISE 2
    public static void getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        if(input > min && input < max){
            System.out.print("Correct");
        } else {
            System.out.print("Give me a number between 1 and 10: ");
        }
    }

}
