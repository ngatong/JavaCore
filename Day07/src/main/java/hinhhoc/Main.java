package hinhhoc;

public class Main {
    public static void main(String[] args) {
        HinhBinhHanh hbh=new HinhBinhHanh(3,5,4);
        System.out.println(hbh.toString());
        System.out.println("Diên tích hình bình hành "+hbh.tinhDienTich());
        System.out.println("Chu vi hình bình hành "+hbh.tinhChuVi());
        System.out.print("-------------------------------\n");
        HinhChuNhat hcn=new HinhChuNhat(4,5);
        System.out.println(hcn.toString());
        System.out.println("Diên tích hình chữ nhật "+hcn.tinhDienTich());
        System.out.println("Chu vi hình chữ nhật "+hcn.tinhChuVi());
        System.out.print("-------------------------------\n");
        HinhTron hinhTron=new HinhTron(5);
        System.out.println(hinhTron.toString());
        System.out.println("Diên tích hình tròn "+hinhTron.tinhDienTich());
        System.out.println("Chu vi hình tròn "+hinhTron.tinhChuVi());
        System.out.print("-------------------------------\n");
        HinhTru hinhTru=new HinhTru(3,5);
        System.out.println(hinhTru.toString());
        System.out.println("Thể tích hình tru: "+hinhTru.tinhTheTich());
    }
}
