package shapes;

public class Square extends Rectangle{ //extends rectangle??
    private double side;

    public Square(double side){
        super(side, side); //extends from rectangle so it needs the 2 parameters to overwrite them, since this is a square we will overwrite both with one variable (side)
        this.side = side;
    }

    public double getArea() {
//        super.getArea();
        double area = Math.pow(side, 2);
        System.out.println("Area: " + area);

        return area;
    }

    public double getPerimeter() {
//        super.getPerimeter();
        double perimeter = side * 4;
        System.out.println("Perimeter: " + perimeter);

        return perimeter;
    }

    public String getMeasurements(){
        String measurements = "  (length:" + this.side + ", width:" + this.side + ")\n";
        System.out.print(measurements);

        return measurements;
    }
}
