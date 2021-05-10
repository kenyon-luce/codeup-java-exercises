package ExceptionsAndErrorHandling;

public class ExceptionsAndErrorHandling {
    //we can throw an exception here

    public static void main(String[] args) throws Exception{
//        throw new Exception("Exception, this has been broken down!");
//        System.out.println("will not show (unreachable)");

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//            e.printStackTrace(System.out);
//            System.out.println(e.getMessage()); // /by zero
//        }

        int[] numbers = {1, 2, 3};
        int x;
        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) { // because x is trying to speak to an index that doesnt exist in the numbers array this condition will be met and will return the custom exception message
            System.out.println("Exception caught!");
            x = 0; //sets a default value to x when a false value is given
        } catch (Exception e) {
            e.printStackTrace(); //prints the exception context
        } finally {
            System.out.println("This will always run."); //sort of like an else statement but for exceptions
        }
    }
}
