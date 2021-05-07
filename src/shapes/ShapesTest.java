package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape; //just the name of the variable we will be making instances of

        myShape = new Rectangle(5,4);
        //to be able to use the getLength and getWidth methods, we need to "initialize" them in the Measurable interface
        System.out.println("[Rectangle]  (length:" + myShape.getLength() + ", width:" + myShape.getWidth() + ")");

        myShape.getArea();
        myShape.getPerimeter();

        System.out.println();

        myShape = new Square(5);

        System.out.println("[Square]  (length:" + myShape.getLength() + ", width:" + myShape.getWidth() + ")");

        myShape.getArea();
        myShape.getPerimeter();
    }
}
