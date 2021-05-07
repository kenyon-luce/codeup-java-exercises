package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(2,4);
        myShape.getArea();
        myShape.getPerimeter();

        myShape = new Square(4);
        myShape.getArea();
    }
}
