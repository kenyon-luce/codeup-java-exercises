import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your favorite number?");
        int number = sc.nextInt();
        System.out.printf("%d is my favorite number too!\n", number);
//        code breaks when you enter something that's not a number

        System.out.println("Give me 3 words");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        System.out.println("First word is: " + first);
        System.out.println("Second word is: " + second);
        System.out.println("Third word is: " + third);

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a sentence");
        String sentence = input.nextLine();
        System.out.println("You typed: " + sentence);
        //??? exits before I enter sentence. Included a new scanner and it worked

        //Calculate perimeter and area of Codeup's classrooms
        System.out.println("What is the length and width of your classroom?");
        int length = input.nextInt();
        int width = input.nextInt();
        int perimeter = (length * 2) + (width * 2);
        int area = length * width;
        System.out.println("The classrooms area is: " + area);
        System.out.println("The classrooms perimeter is: " + perimeter);
    }
}
