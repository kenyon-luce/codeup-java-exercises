package shapes;

public class Square extends Quadrilateral{

    @Override
    public double getPerimeter() {
        int perimeter = length * 4;
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = length * 2;
        return 0;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
