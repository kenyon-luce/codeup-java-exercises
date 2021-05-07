package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public double getPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }
    //9: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    //because we are creating a myShape with an instance of Rectangle, we need to pull from this method which is extended from Measurable, otherwise it would not know how to get the perimeter for Rectangle

    @Override
    public double getArea() {
        double area = length * width;
        System.out.println("Area: " + area);
        return area;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
}
