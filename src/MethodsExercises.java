import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(1,2));
//        System.out.println(Subtraction(1,2));
//        System.out.println(Multiplication(1,2));
//        System.out.println(Division(1,2));
//        System.out.println(Modulus(1,2));

        //EXERCISE 3
//        String response;
//        do {
//            Scanner sc = new Scanner(System.in);
//            int userInput = getInteger(1, 10);
//            System.out.print("Continue? [Y/N] ");
//            response = sc.next();
//        } while (response.equalsIgnoreCase("Y"));

        //EXERCISE 4
//        rollDice();

        //EXERCISE 5
        HighLow();
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
    }

    //EXERCISE 4
    public static void rollDice() {
        String response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("You are rolling a pair of dice, how many sides do both dies have?");
            int sides = sc.nextInt();
            int die1 = (int) (Math.random() * (sides - 1) + 1);
            //because we are getting a number, we need to make sure it reads as an integer by adding (int) before the actual variable value
            int die2 = (int) (Math.random() * (sides - 1) + 1);
            System.out.println(die1 + "  " + die2);
            int result = die1 + die2;
            System.out.println("You rolled a " + result + "!");

            System.out.println("Re-roll?  [Y/N]");
            response = sc.next();
        } while (response.equalsIgnoreCase("Y"));
    }

    //EXERCISE 5
    public static void HighLow() {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * (100 - 1) + 1);
        System.out.println("Guess the number!");
//        System.out.println("(" + randomNum + ")");
        //^this was just to test the game

        int guessLimit = 5;
        int guesses = 0;
        int guess; //the variable name is outside so we can call on it later
        do {
            guess = sc.nextInt(); ///giving it a value here lets you update to a new guess since it loops
            if (guess > randomNum) {
                System.out.println("HIGH");
            } else if (guess < randomNum) {
                System.out.println("LOW");
            }
            guesses++;
            System.out.println("Guesses left: " + (guessLimit - guesses));
        } while (guess != randomNum);
        //^as you guess wrong, it will return the relevant response and will loop again. When you guess the correct number, you will exit the loop and get the following response
        System.out.println("GOOD GUESS!");

//        int guessesLeft;
//        if (guessesLeft == 0){
//            do {
//                guess = sc.nextInt();
//                if (guess > randomNum) {
//                    System.out.println("HIGH");
//                } else if (guess < randomNum) {
//                    System.out.println("LOW");
//                }
//                guesses++;
//                System.out.println("Guesses left: " + (guessLimit - guesses));
//            } while (guess != randomNum);
//            System.out.println("GOOD GUESS!");
//        }

    }

}
