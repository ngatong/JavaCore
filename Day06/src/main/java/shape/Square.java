package shape;

public class Square extends Rectangle {
    protected double side=1.0;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
       super.setWidth(side); ;
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
       return super.toString();
    }
}
