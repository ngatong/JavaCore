import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise10 {
    //Write a Java program to reverse an array of integer values
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n= ");
        int n = index.nextInt();
        int i,j, temp;
        int[] arr1 = new int[n];
        System.out.println("Mời bạn nhập mảng số nguyên: ");
        for ( i = 0; i < n; i++) {
            System.out.print("Array[" + i + "]= ");
            arr1[i] = index.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for ( j = 0; j < arr1.length; j++)
            System.out.print(arr1[j] + " ");
             System.out.println();
        for ( j = 0; j < arr1.length / 2; j++) {
            temp = arr1[j];
            arr1[j] = arr1[n - 1 - j];
            arr1[n - 1 - j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        for ( j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j]+" ");
        }
    }
}
