import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        ****************EXERCISE 4*****************
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your grade");
        int grade = sc.nextInt();
        if(grade >= 88){
            System.out.println("A");
        } else if(grade >= 80){
            System.out.println("B");
        } else if(grade >= 67){
            System.out.println("C");
        }else if(grade >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
