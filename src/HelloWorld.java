public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        ^prints a new empty line after printing this

        System.out.print("Hello, World!");
//        ^prints this without creating a new line
        System.out.print("\n");
//        ^by adding another one that adds "\n", we are forcing the line to break and are now getting the same result as .println
    }
}

//in order for a java file to run, it must be in a main method (sorta like a function)
//the class has to have the same name as the file it is in, else you will get an error
//to make the code run in the class, we need to use "main" method
//when a java file runs in a repo for the first time, an "out" folder is created, which stores the compiled version of the file separate from "src"
//each line of code NEEDS to have a ";" at the end of it, else you will get an error