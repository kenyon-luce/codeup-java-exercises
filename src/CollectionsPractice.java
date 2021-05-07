import java.util.ArrayList;

public class CollectionsPractice {
    public static void main(String[] args){
        ArrayList<String> family = new ArrayList<>();
        family.add("Kenyon");
        family.add("Aiden");
        family.add("Ivelisse");
        family.add("Dave");

        upperLastElement(family);

        ArrayList<String> empty = new ArrayList<>();

        upperLastElement(empty);

        ArrayList<String> one = new ArrayList<>();
        one.add("one");

        upperLastElement(one);
    }
    public static void upperLastElement(ArrayList<String> array) {
        if(array.size() < 1){
            array.add("");
        }
        String lastElement = array.get(array.size() - 1);

        for(String element : array){
            if(element.equals(lastElement)){
                System.out.println(lastElement.toUpperCase());
                break;
            }
            System.out.println(element);
        }
    }
}
