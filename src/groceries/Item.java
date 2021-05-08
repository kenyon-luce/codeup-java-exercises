package groceries;

public class Item {
    private String name;
    private String category;
    private int quantity;

    public Item(String itemName, String category){
        this.name = itemName;
        this.category = category;
        this.quantity = 1;
    }

    public String getItemName(){
//        System.out.println(this.itemName);
        return this.name;
    }

    public String getCategory(){
//        System.out.println(this.category);
        return this.category;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int setQuantity(int amount){
        return this.quantity = amount;
    }
}
