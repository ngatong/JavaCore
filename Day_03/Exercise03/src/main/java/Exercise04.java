import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise04 {
// Write a Java program to insert an element (specific position) into an array

    public static void main( String args [ ] )

    {
        Scanner index = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n= ");
        int n = index.nextInt();
        int[] Array = new int[n];
        System.out.println("Mời bạn nhập mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "]= ");
            Array[i] = index.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int j = 0; j < Array.length; j++)
            System.out.print(Array[j] + " ");
            System.out.println();
        System.out.print("Số phần tử cần thêm vào mảng là m: ");
        int m = index.nextInt();
        int[] Array1 = new int[m];
        System.out.println("Các giá trị cần thêm là: ");
        for (int j = 0; j < m; j++) {
            System.out.print("Array1[" + j + "] ");
            Array1[j] = index.nextInt();
        }
        System.out.println("Mảng sau khi thêm là:");
        int[] allA=new int[m+n];
        for (int i = 0; i < n + m; i++) {
            if(i<n)
                allA[i]=Array[i];
            else
                allA[i]=Array1[i-n];
            System.out.print(allA[i]+" ");
        }
    }
}
