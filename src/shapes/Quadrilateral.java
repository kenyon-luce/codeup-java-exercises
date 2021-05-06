package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public void setMeasurements(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    abstract int setLength();
    abstract int setWidth();
}
