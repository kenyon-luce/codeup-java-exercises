import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");

        // ============================== print() VS println()

        // this:
        System.out.println("here");
        System.out.println("there");

        // is equivalent to this:
        System.out.print("here\n");
        System.out.println("there\n");

        // without the newline characters, print outputs this:
        System.out.print("here");
        System.out.println("there");

        // to concatenate, just like JS:
        String firstName = "Douglas";
        String lastName = "Hirsh";
        System.out.println(firstName + " " + lastName);

        // ============================== printf() / .format()

        // Print a formatted string using the following... printf(formatString)

        // same output as print():
        System.out.printf("Hello");
        System.out.printf("There");

        // multiple variables:
        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);
        // %s for strings, tells it what the following variables are, also need \n where it is

        // numbers:
        int numberOfPets =  3;
        String typeOfPets =  "cats";
        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);
        // %d for numbers

        // currency:
        float currencyPennies = 1000.001F;
        System.out.printf("My iPhone cost $%.3f\n", currencyPennies);
        // $%.3f logs the number with 3 decimal spaces

        // ================================= USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you %s\n", userFirstName);
        //to clarify, this is only working with printf (the f is important, stands for format)

        System.out.println("How old are you?");
        int age = sc.nextInt();
        //next picks up the number after pressing enter

        System.out.printf("Good to hear you are %d years old.\n", age);
        //OooooooOoo so those symbols tell the variable where to go, age will show up where the %d is. The \n is needed since each of the massages will show in order of completion and we don't want the strings to be glued to each other

        sc.nextLine();
        //nextLine picks up the line you pressed enter on!
        System.out.println("What is your favorite quote?");
        String favoriteQuote = sc.nextLine();

        System.out.printf("Funny, \"%s\" is my favorite quote too.", favoriteQuote);
        //nextLine takes an entire sentence rather than a single word or number, also its important that I declare that method (ln 64) before using it (ln 66)
    }
}
