package shapes;

public class Square extends Quadrilateral{

    @Override
    public double getPerimeter() {
        double perimeter = length * 4;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.pow(length, 2);
        System.out.println("Area: " + area);
        return 0;
    }

    //why does it complain when I delete the 2 code blocks below?
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double side){
        this.length = side;
        this.width = side;
    }
}
