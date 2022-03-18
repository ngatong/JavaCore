package hinhchunhat;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat();
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhap chieu dai= ");
        hcn.chieuDai=input.nextDouble();
        System.out.printf("Nhap chieu rong= ");
        hcn.chieuRong=input.nextDouble();
        System.out.printf("HCN co chu vi: %f",hcn.tinhChuVi());
        System.out.printf("\nHCN co dien tich: %f\n",hcn.tinhDienTich());
        System.out.println(hcn.toString());
    }
}
