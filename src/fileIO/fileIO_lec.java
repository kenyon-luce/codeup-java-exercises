package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class fileIO_lec {
    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++){
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Path filePathPoem = Paths.get("./src/fileIO/poem.txt");

        System.out.println("read poem: " + Files.exists(filePathPoem));
        fileIO_lec.printPoem(filePathPoem); //prints poem and uses loop to number each line

        System.out.println();

        //we can combine paths so we don't have to keep typing directory when searching for a specific file
        String directory = "./src/fileIO";
        String file = "groceries.txt";

        Path dataFile = Paths.get(directory, file); //grocery path
//        System.out.println("This is a combined path: " + dataFile); //automatically added a "/" in between the directory and file
        List<String> groceries = Arrays.asList("coffee", "milk", "sugar");
        Files.write(dataFile, groceries);

        List<String> groceryList = Files.readAllLines(dataFile);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }
    }
}
