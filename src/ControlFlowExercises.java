import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean confirm;
        do {
            System.out.println("Hi! I'm a loop, how many numbers should I loop? ");
            int upToUserInput = sc.nextInt();

            System.out.println("____________________________");
            System.out.println("| number | squared | cubed |");
            System.out.println("| ------ | ------- | ----- |");

            for (int i = 1; i <= upToUserInput; i++) {
                double squared = Math.pow(i, 2);
                double cubed = Math.pow(i, 3);
                int sq = (int) squared;
                int cu = (int) cubed;
                System.out.printf("| %-7d| %-8d| %-5d |\n", i, sq, cu);
            }
            System.out.println("----------------------------");
            System.out.println("Here you go!");

            System.out.print("Loop again? [Y/N]\n");
            String userInput = sc.next();
            confirm = userInput.equalsIgnoreCase("Y");

        } while (confirm);
    }
}
