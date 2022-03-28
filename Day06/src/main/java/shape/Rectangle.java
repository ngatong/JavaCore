package shape;

public class Rectangle extends Shape {
    protected double width=1.0;
    protected double length=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, Boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }
    public String toString(){
       return super.toString()+" "+getWidth()+" "+getLength();
    }
}
