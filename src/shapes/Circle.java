package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;
    //private property

    public Circle(double radius){
        this.radius = radius;
        //this probably makes the inputted radius private
        //this allows us to create a circle with the inputted radius by declaring it in a new object
        //the radius is passed through and caught by the below functions
    }
    public double getArea(){
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.printf("Area: %.2f\n" ,area);
        return area;
    }
    public double getCircumference(){
        double circum = (radius * 2) * Math.PI;
        System.out.printf("Circumference: %.2f\n" ,circum);
        return circum;
    }
}
