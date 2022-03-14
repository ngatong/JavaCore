public class btvn110 {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1;
        while (k >= 1 && k <= 25) {

            for (j = 1; j <= 97; j++) {

                i = 200 - (2 * j) - (5 * k);
                if (i >= 1) {
                    System.out.printf("Cần có %d tờ 1.000, %d tờ 2.000, %d tờ 5.000%n", i, j, k);

                }

            }
            k++;
        }

    }
}