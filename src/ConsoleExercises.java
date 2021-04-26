import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int number = sc.nextInt();
        System.out.printf("%d is my favorite number too!\n", number);
        //code breaks when you don't enter a number

        sc.nextLine();
        System.out.println("Give me 3 words");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //nextLine()
    }
}
