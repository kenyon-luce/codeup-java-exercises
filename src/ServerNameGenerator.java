import java.util.Random;

public class ServerNameGenerator {
    String[] adjectives = {"sad", "happy", "wise", "foolish", "fast", "slow", "red", "orange", "yellow", "green", "blue", "purple",};
    String[] nouns = {"wolf", "moose", "rooster", "Dan", "Bert", "Joe", "car", "bus", "plane", "bike", "house", "lily"};
    Random randomAdj = new Random(adjectives.length);
    Random randomNoun = new Random(nouns.length);
}
