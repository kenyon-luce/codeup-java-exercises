package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public double getPerimeter() {
        int perimeter = (length * 2) + (width * 2);
        System.out.println(perimeter);
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = length * width;
        System.out.println(area);
        return area;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
}
