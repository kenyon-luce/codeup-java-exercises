public class MethodsLecture {
    public static void main(String[] args){
        System.out.println("Hello, Methods");
        // ********** DEFINING AND CALLING METHODS **********
        sayGreeting();
        //^now the below method runs
        sayInput("Hello, Class");
        //^since we gave this one a string parameter, we need to pass one in in order for it to work
        System.out.println(getGreetingWithName("Marco"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("Greetings, ", "Douglas"));
        System.out.println(countTo100(1));
    }

    //no inputs or outputs
    public static void sayGreeting(){
//        System.out.println("Hello");
        //this method doesn't run because we didn't call on it yet
        System.out.println(getDefaultGreeting());
    }

    public static void sayInput(String input){ //have to always define the parameters value
        System.out.println(input);
    }

    //return output without input
    public static String getDefaultGreeting(){
        return "Hello,";
        //we don't include "void in these methods because we are passing things into it"
    }

    //return output with input
    public static String getGreetingWithName(String name){
        return getDefaultGreeting() + " " + name;
    }

    //return output with input using numbers
    public static double returnProductOfThreeNumbers(double num1, double num2, double num3){
        double result = num1 + num2 + num3;
        return result;
    }

    //method overloading
    public static String getGreetingWithName(String salutation, String name){
        return salutation + name;
    }

    //***********RECURSION***********
    public static void countToLoop(int num){
        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
    public static int countTo100(int num){
        System.out.println(num);
        if(num == 100){
            return num;
        } else {
            return countTo100(++num);
        }
    }
}

