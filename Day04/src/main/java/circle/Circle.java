package circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    double getCircumference() {
        return 2 * getRadius() * Math.PI;
    }

    public String toString() {
        return "Với radius= " + getRadius() + " thì hình tròn có chu vi là " + getCircumference() + " và bán kính là " + getArea();
    }
}
