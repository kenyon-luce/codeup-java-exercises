package groceries;

import java.util.Scanner;

public class GroceriesApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a grocery list?");
        String initialize = sc.next();

        if(initialize.startsWith("y")){
            System.out.println("ok");
        }
    }
}
