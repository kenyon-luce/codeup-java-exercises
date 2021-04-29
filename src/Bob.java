import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob, he is a lackadaisical teenager\nhence, he is very limited in conversation...");
        String interact = sc.nextLine();
        if(interact.endsWith("?")){
            System.out.println("Sure.");
        } else if(interact.endsWith("!")){
            System.out.println("Woah, chill out!");
        } else if(interact.equals("")){
            System.out.println("*stares*");
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
