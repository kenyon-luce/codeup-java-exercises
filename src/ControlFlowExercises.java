import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean confirm;
        do {
            System.out.println("What number would you like to go up? ");
            int upToUserInput = sc.nextInt();

            System.out.println("Here is your table!");
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

            System.out.print("Continue? [y/N]\n");
            String userInput = sc.next();
            confirm = userInput.equalsIgnoreCase("y");

        } while (confirm);
    }
}
