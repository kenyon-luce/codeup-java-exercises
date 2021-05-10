package util;

import java.util.InputMismatchException;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Give me a string");
        Input.getString();
        Input.yesNo();
        Input.getInt(1, 10);
        Input.getDouble(1, 10);

        try{
            Input.getInt();
            Input.getDouble();
        } catch(NumberFormatException e){
            System.out.println("working");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }

        //^not working as intended
    }
}
