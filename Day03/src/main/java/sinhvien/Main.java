package sinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1, "Tống Thị Nga", 9, 10);
        SinhVien sv2 = new SinhVien(2, "Bùi Thị Bích Phương", 8, 9);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhập mã của SV3: ");
        sv3.setMaSinhVien(input.nextInt());
        input.nextLine();
        System.out.print("Nhập tên của SV3: ");
        sv3.setHoTen(input.nextLine());
        System.out.print("Nhập điểm LT của sv3: ");
        sv3.setDiemLyThuyet(input.nextFloat());
        System.out.print("Nhập điểm TH của sv3: ");
        sv3.setDiemThucHanh(input.nextFloat());
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        System.out.printf("%6s %10s %20s %10s %10s \n", "MSV", "Họ tên", "Điểm lý thuyết", "Điểm thực hành", "Điểm trung bình");
        sv1.print();
        sv2.print();
        // sv3.print();
    }
}
