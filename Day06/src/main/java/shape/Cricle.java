package shape;

public class Cricle extends Shape {
    protected double radius = 1.0;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*getRadius()*Math.PI;
    }
    public String toString() {
        return super.toString()+" " +getRadius();
    }

}
