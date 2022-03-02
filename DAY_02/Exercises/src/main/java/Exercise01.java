public class Exercise01 {
    // tính tổng các số có 3 chữ số
    public static void main(String[] args) {
        int i, sum=0;
        for(i=100;i<=999;i++)
        {
            sum=sum+i;
        }
        System.out.println("Tổng của các số có 3 chữ số là "+sum);
    }
}
