package ExceptionsAndErrorHandling;

public class ExceptionsAndErrorHandling {
    //we can throw an exception here

    public static void main(String[] args) throws Exception{
//        throw new Exception("Exception, this has been broken down!");
//        System.out.println("will not show (unreachable)");

        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage()); // /by zero
        }
    }
}
