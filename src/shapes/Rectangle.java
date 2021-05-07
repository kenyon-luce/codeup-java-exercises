package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public double getPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

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
