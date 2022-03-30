package circle;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle.toString());
        System.out.println("Perimeter is "+circle.getPerimeter());
        System.out.println("Area is "+circle.getArea());
        ResizableCircle resize=new ResizableCircle(circle.radius);
        System.out.print("Change radius to ");
        resize.resize(20);
        System.out.println(resize.toString());
    }
}
