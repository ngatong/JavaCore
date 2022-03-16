public class BTVN255 {
    public static void sapxeptang(int[] arr) {
        int i, j, tg = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }
        }
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ ",");

    }

    public static void main(String[] args) {
        int[] arr = {4, 34, 9, 0, 3, 4};
        System.out.println("Mảng ban đầu là: ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] +", ");
        System.out.println("\nMảng sau khi sắp xếp là: ");
        sapxeptang(arr);
    }

}
