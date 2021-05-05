package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area = length * width;
        System.out.println("Area: " + area);

        return area;
    }

    public double getPerimeter(){
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter: " + perimeter);

        return perimeter;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public String getMeasurements(){
        return "  (length: " + getLength() + ", width: " + getWidth() + ")\n";
    }
}
