package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1=new Vehicle();
        Vehicle xe2=new Vehicle();
        Vehicle xe3=new Vehicle();
        Scanner input= new Scanner(System.in);
        System.out.printf("Nhập dung tích xe 1: ");
        xe1.setDungTich(input.nextInt());
        System.out.printf("Giá trị xe 1: ");
        xe1.setGiaTriXe(input.nextFloat());
        System.out.printf("Nhập dung tích xe 2: ");
        xe2.setDungTich(input.nextInt());
        System.out.printf("Giá trị xe 2: ");
        xe2.setGiaTriXe(input.nextFloat());
        System.out.printf("Nhập dung tích xe 3: ");
        xe3.setDungTich(input.nextInt());
        System.out.printf("Giá trị xe 3: ");
        xe3.setGiaTriXe(input.nextFloat());
        System.out.printf("%6s %10s %20s %20s\n", "Tên xe", "Dung tích xe", "Giá trị xe", "Mức thuế");
        System.out.printf("Xe 1 %10d %20.2f %20.2f\n",xe1.getDungTich(),xe1.getGiaTriXe(),xe1.mucThue());
        System.out.printf("Xe 2 %10d %20.2f %20.2f\n",xe2.getDungTich(),xe2.getGiaTriXe(),xe2.mucThue());
        System.out.printf("Xe 3 %10d %20.2f %20.2f\n",xe3.getDungTich(),xe3.getGiaTriXe(),xe3.mucThue());


    }
}
