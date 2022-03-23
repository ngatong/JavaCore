package circle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cylinder> cylinder = new ArrayList();
        cylinder.add(new Cylinder(5, "Green", 4));
        cylinder.add(new Cylinder(6, "Green", 7));
        for(Cylinder cyl: cylinder )
        System.out.printf(cyl.toString()+"có diện tích hình tròn là "+cyl.getArea() +" và thể tích hình trụ là "+cyl.getVolume()+"\n");
    }

}
