package shapes;

import util.Input;

//import java.util.Scanner;

public class CircleApp {
    private static int count = 0;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("What is the radius of your circle?");
            double input = Input.getDouble();
            System.out.printf("Radius: %.2f\n", input);
            Circle newCircle = new Circle(input);
            newCircle.getArea();
            newCircle.getCircumference();
            count++;
        } while (Input.yesNo());

        System.out.println("You finished making " + count + " circles");
    }
}
