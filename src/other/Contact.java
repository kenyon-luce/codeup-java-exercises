package other;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
     return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //append to contacts.txt
    public static void main(String[] args) throws IOException {
        String filePath = "./src/other/contacts.txt";

        String appendText = "APPEND";

        List<String> contactsList = Files.readAllLines(Paths.get(filePath));

//        Files.write(filePath, Arrays.asList(appendText), StandardOpenOption.APPEND);
    }
}
