package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius){
        System.out.println("This is a circle with a radius of: " + radius);
    }
    public double getArea(){
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
    public double getCircumference(){
        double circum = (radius * 2) * Math.PI;
        return circum;
    }
}
