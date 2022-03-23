package person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList();
        students.add(new Student("Tống Thị Nga", "Ninh Bình","THPT",2008,10000000));
        students.add(new Student("Bùi Bích Phương", "Ninh Bình","THPT",2009,15000000));


        ArrayList<Staff> staff=new ArrayList() ;
        staff.add(new Staff("Mai Phương Thúy","Ninh Bình","THPT",400000));
        staff.add(new Staff("Nguyễn Lê Danh","Ninh Bình","THPT",1000000));
        for (Student stu:students)
            System.out.printf(stu.toString()+"\n");
        for (Staff sta:staff)
            System.out.printf(sta.toString()+"\n");

    }
}
