import org.jetbrains.annotations.NotNull;

public class BTVN240 {
    public static int tontaikhong(int [] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
            {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4,6, 1};
        System.out.println("Mảng là: ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] +", ");
        if (tontaikhong(arr) == 1)
            System.out.println("\nMảng có chứa giá trị 0");
        else
            System.out.println("\nMảng không chứa giá trị 0");
    }
}
