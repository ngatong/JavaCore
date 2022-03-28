package shape;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(5);
        Rectangle rectangle=new Rectangle(4,5);
        Square square=new Square(5);
        System.out.println("Hình tròn: "+cricle.toString() + " có diện tích là " + cricle.getArea() + " và chu vi là " + cricle.getPerimeter());
        System.out.println("Hình chữ nhật "+rectangle.toString()+" có diện tích là "+rectangle.getArea()+" và chu vi là "+rectangle.getPerimeter());
        System.out.println("Hình vuông "+square.toString() +square.getArea()+ square.getPerimeter());
    }
}
