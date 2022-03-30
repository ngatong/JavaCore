package circle;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void resize(int percent){
        System.out.println(radius *=percent/100.0);
    }
}
