import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    // Write a Java program to find the second largest element in an array
    public static void main(String[] args) {

        Scanner index = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n= ");
        int n = index.nextInt();
        int[] arr = new int[n];
        System.out.println("Mời bạn nhập mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "]= ");
            arr[i] = index.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");
        System.out.println();
        if (n < 2) {
            System.out.println("Khong ton tai phan tu lon thu 2");
        }
        else
        {
            Arrays.sort(arr);
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != arr[n - 1]) {
                    System.out.println("Phan tu lon thu 2: " + arr[i]);
                    return;
                }
            }
            System.out.println("Khong ton tai phan tu lon thu 2");
        }
    }
}
