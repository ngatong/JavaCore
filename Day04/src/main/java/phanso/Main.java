package phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo obj1 = new PhanSo(3, 4);
        PhanSo obj2 = new PhanSo(5, 4);
        Calculator a = new Calculator();
        System.out.printf("Phân số obj1= " + obj1.getTuSo() + "/" + obj1.getMauSo());
        System.out.printf("\nPhân số obj2= " + obj2.getTuSo() + "/" + obj2.getMauSo());

        System.out.println("\nTổng của 2 phân số " + obj1.getTuSo() + "/" + obj1.getMauSo() + " và " + obj2.getTuSo() + "/" + obj2.getMauSo() + " là: " + a.Tong(obj1, obj2));
        System.out.println("Hiệu của 2 phân số " + obj1.getTuSo() + "/" + obj1.getMauSo() + " và " + obj2.getTuSo() + "/" + obj2.getMauSo() + " là: " + a.Hieu(obj1, obj2));
        System.out.println("Tích của 2 phân số " + obj1.getTuSo() + "/" + obj1.getMauSo() + " và " + obj2.getTuSo() + "/" + obj2.getMauSo() + " là: " + a.Tich(obj1, obj2));
        System.out.println("Thương của 2 phân số " + obj1.getTuSo() + "/" + obj1.getMauSo() + " và " + obj2.getTuSo() + "/" + obj2.getMauSo() + " là: " + a.Thuong(obj1, obj2));
    }
}
