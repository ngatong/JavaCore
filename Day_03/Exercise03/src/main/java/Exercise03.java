import java.util.Arrays;

public class Exercise03 {
    // Write a Java program to find the maximum and minimum value of an array
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=3;
        arr[1]=2;
        arr[2]=4;
        arr[3]=9;
        arr[4]=0;
        System.out.println(Arrays.toString(arr));
        int min =arr[0];
        int max= arr[0];
        for (int i: arr)
        {
            if(i>max)
                max=i;
        }
        System.out.println("Số lớn nhất của mảng là " +max);
        for (int i: arr)
        {
            if(i<min)
                min=i;
        }
        System.out.println("Số nhỏ nhất của mảng là " +min);
    }
}
