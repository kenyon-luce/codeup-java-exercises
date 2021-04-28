import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        //EXERCISE 5
        HighLow();
    }

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
    }
}
