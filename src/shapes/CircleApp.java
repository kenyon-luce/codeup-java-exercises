package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What is the radius of your circle?");
            double inputRadius = sc.nextDouble();
            System.out.printf("Radius: %.2f\n", inputRadius);

            Circle newCircle = new Circle(inputRadius);
            newCircle.getArea();
            newCircle.getCircumference();
        } while (Input.yesNo());
    }
}
