package util;

import java.util.InputMismatchException;

public class InputTest {
    public static void main(String[] args) {
        Input.getString();
        Input.yesNo();
        Input.getInt(1, 10);
        Input.getDouble(1, 10);
    }
}
