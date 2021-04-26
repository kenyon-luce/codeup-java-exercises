import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        ****************EXERCISE 3: Table of Powers*****************
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! I'm a loop, how many numbers should I loop?");
        int input = sc.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int i = 1; i <= input; i++){
            int number = i;
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%d      | %d       | %d\n", number, squared, cubed);
        }
        System.out.print("Here you go!");
    }
}
