import java.util.Scanner;

public class ControlStatementLoopLec {
    public static void main(String[] args) {
        //Boolean Expressions
        //In Java, an extra '=' is not needed in an expression because value types have to be explicitly stated already
        System.out.println("(5 == 5) = " + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'y') = " + ('y' == 'y'));

        boolean isAdmin = true;
        System.out.println("(isAdmin == false) = " + (isAdmin == true));

        //Logical Operators
        boolean isLoggedIn = false;
        boolean isOwner = false;
        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn));
        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". should I let this person the ability to edit their post? " + (isOwner || isAdmin));

        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ". Am I not logged in? " + (!isLoggedIn));
        //etc...

        int y = 2;
        int x = 3;
        // a single logical operator ( "|", "&" ) evaluate both expressions in Java

        if (false & (++x == y)) {
            System.out.println("x = " + x);
            System.out.println("Equal!");
        } else {
            System.out.println("x = " + x);
            System.out.println("Unequal.");
        }
        String str1 = "Kenyon";
        String str2 = "Kenyon";

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1.equal(str)) = " + (str1.equals(str2)));

        //if statements

        if (isAdmin && isLoggedIn) {
            System.out.println("Admin portal accessed");
        } else {
            System.out.println("Admin portal locked");
        }

        if (isAdmin || isOwner) {
            System.out.println("Show edit button");
        } else {
            System.out.println("Can't edit post");
        }

        if (isLoggedIn) {
            System.out.println("Logged In!");
        } else {
            System.out.println("Logged out");
        }

        // for the above if statements, changing the boolean value of the called variables will return their respective results
        //else if statements can also be used, just like Javascript


//        Switch
//        case statement:
        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("diceroll = " + diceRoll);

        switch (diceRoll) {
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a three!");
                break;
            case 4:
                System.out.println("Rolled a four!");
                break;
            case 5:
                System.out.println("Rolled a five!");
                break;
            case 6:
                System.out.println("Rolled a six!");
                break;
        }
//        While
//        int i = 100;
//        while (i <= 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        boolean newsLetterSignUp = true;
        Scanner scanner = new Scanner(System.in);

        while (newsLetterSignUp) {
            System.out.println("Are you ready to sign up for our newsletter? Note: only 'yes' will work :)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("yes")) {
                System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up!");
                newsLetterSignUp = false;
            } else {
                System.out.println("I'm sorry . . that's an unacceptable answer.");
            }

            //Do-while

//            boolean newsLetterSignUp = false;
//            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Are you ready to sign up for our newsletter? Note: Only 'yes' will work. :)\n");
//                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up.");
                    newsLetterSignUp = false;
                } else {
                    System.out.println("I'm sorry. . that's an unacceptable answer.");
                    newsLetterSignUp = true;
                }
            } while (newsLetterSignUp);


//        For loop
//            for (int i = 0; i < 10; i += 1) {
//                System.out.println("i is currently: " + i);
//            }

//            String[] fruits = {"apples", "bananas", "jackfruit"};

//            for (int i = 0; i < fruits.length; i++) {
//                System.out.println("Here's a fruit: " + fruits[i]);
//            }

        }

//        Break && Continue

//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 7) {
//                System.out.println("Woops - hit the stopping point!");
//                break;
//            }
//        }

//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }

        //Continue:
        //Goal: Skipping odd nums, print even nums!

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println("Odd number - get outta here!");
//                continue;
//            }
//            System.out.println("Here's a nice even number " + i);
//        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("skipping odd number");
                continue;
            }
            System.out.println("Heres an even number " + i);
        }
    }

}
