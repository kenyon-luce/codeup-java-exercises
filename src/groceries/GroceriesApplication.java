package groceries;

import java.util.*;

import util.Input;

public class GroceriesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a grocery list?");
        String initialize = sc.next();

        if (initialize.startsWith("y")) {
            Item newItem;
            String finalize;
            List<Item> itemList;
            do{
            System.out.println("ok");
            System.out.println(
                    "1 - Beverages\n" +
                            "2 - Bread/Bakery\n" +
                            "3 - Canned/Jarred Goods\n" +
                            "4 - Dairy\n" +
                            "5 - Frozen Foods\n" +
                            "6 - Meat\n" +
                            "7 - Produce\n"
            );


            System.out.println("Please Select a category");

            String category = "";
            int select = Input.getInt(1, 7);
            switch (select) {
                case 1:
                    category = "beverages";
                    break;
                case 2:
                    category = "bread/bakery";
                    break;
                case 3:
                    category = "canned/jarred";
                    break;
                case 4:
                    category = "dairy";
                    break;
                case 5:
                    category = "frozen foods";
                    break;
                case 6:
                    category = "meat";
                    break;
                case 7:
                    category = "produce";
                    break;
            }
            System.out.println("You selected: " + category);

            System.out.println("What name? (single name)");
            String name = sc.next();

            System.out.println("How many?");
            int quantity = sc.nextInt();
            itemList = new ArrayList<>();

                newItem = new Item(name, category);
                itemList.add(newItem);
                System.out.println("Add new item? [Y/N]");
                finalize = sc.next();
            } while(finalize.equalsIgnoreCase("y"));

//            System.out.println("Name: " + newItem.getItemName());
//            System.out.println("Category: " + newItem.getCategory());
//            newItem.setQuantity(quantity);
//            System.out.println("Quantity: " + newItem.getQuantity());


            for(Item item : itemList){
                System.out.printf("(%s, %s, %d)\n", item.getItemName(),item.getCategory(), item.getQuantity());
            }
        }
    }
}
