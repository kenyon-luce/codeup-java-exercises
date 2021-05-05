public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        ^prints a new empty line after printing this

        System.out.print("Hello, World!");
//        ^prints this without creating a new line
        System.out.print("\n");
//        ^by adding another one that adds "\n", we are forcing the line to break and are now getting the same result as .println

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        String myString = "--> this is my string <--";
        //because we told it to be a string, we can only assign a string to it
        System.out.println(myString);

        float myNumber;
//        myNumber = (float)3.14;
        //can't log an unassigned variable
        //depending on the data type, you can only assign an INTEGER within its specific range
        //though, by casting it EXPLICITLY we can use non integers such as pi
        myNumber = 3.14F;
        //^does the same
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
        //increment applies before the x, that's why you get 6 in both instances compared to the code above
//        System.out.println(x);

        //can't make a variable named class cuz we're in one lol
        //class is a reserved keyword

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //error: exception in thread

//        int three = (int) "three";
//        error: string cannot be converted to int

//        int x = 4;
////        x = x + 5;
//        x += 5;
        //shorthand operators work here

//        int x = 900000000;
//        int y = 4;
////        y = y * x;
//        y *= x; //-694967296
//        System.out.println(y);
//        if we increment a numerical variable to a number larger that the int can hold, it will return a strange negative number

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y; // 10 / 2 = 5
        y -= x; // 2 - 5 = -3
        System.out.println(x);
        System.out.println(y);
    }
}

//in order for a java file to run, it must be in a main method (sorta like a function)
//the class has to have the same name as the file it is in, else you will get an error
//to make the code run in the class, we need to use "main" method
//when a java file runs in a repo for the first time, an "out" folder is created, which stores the compiled version of the file separate from "src"
//each line of code NEEDS to have a ";" at the end of it, else you will get an error