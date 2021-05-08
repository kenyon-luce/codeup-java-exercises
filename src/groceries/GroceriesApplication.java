package groceries;

import java.util.Scanner;

public class GroceriesApplication {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Create a grocery list?");
//        String initialize = sc.next();

//        if (initialize.startsWith("y")) {
//            System.out.println("ok");
//            System.out.println(
//                    "1 - Beverages\n" +
//                    "2 - Bread/Bakery\n" +
//                    "3 - Canned/Jarred Goods\n" +
//                    "4 - Dairy\n" +
//                    "5 - Frozen Foods\n" +
//                    "6 - Meat\n" +
//                    "7 - Produce\n"
//            );
//        }

        Item newItem = new Item("bread", "bread");
        System.out.println(newItem.getItemName());
        System.out.println(newItem.getCategory());
//        System.out.println(newItem.defaultQuantity);
        System.out.println(newItem.getQuantity());
        System.out.println(newItem.setQuantity(2));
        System.out.println(newItem.getQuantity());

    }
}
