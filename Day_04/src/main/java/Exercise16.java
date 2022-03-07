import java.util.Scanner;

public class Exercise16 {
    // Write a program in Java to reverse a number.
    // Function to reverse the number
    public static void main(String[] args) {
        int n, sodu, reverse = 0;
        System.out.print("Nhap vao mot so nguyen:n= ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>0){

            sodu = n%10;
            reverse = (reverse*10) + sodu;
            n = n/10;
        }

        System.out.print("So dao nguoc cua n la: "+ reverse);
    }
}
