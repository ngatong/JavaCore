package shape;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        width = side;
        length = side;
    }
public double getSide(){
        return length;
}
public void setSide(double side){
        length=side;
        width=side;
}

    public void setWidth(double side){
       super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
       return super.toString();
    }
}
