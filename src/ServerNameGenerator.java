import java.util.Arrays;
import java.util.Random;


public class ServerNameGenerator {
    public static void main(String[] args){
        String[] adjectives = {"sad", "happy", "wise", "foolish", "fast", "slow", "red", "orange", "yellow", "green", "blue", "purple",};
        String[] nouns = {"wolf", "moose", "rooster", "Dan", "Bert", "Joe", "car", "bus", "plane", "bike", "house", "lily"};

//        System.out.println(randomElement(adjectives));
//        System.out.println(randomElement(nouns));
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }
    public static String randomElement(String[] word){
        return word[(int) (Math.random() * (word.length-1))];
    }
}


