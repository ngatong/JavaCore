import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        int i,j,n,k=1;
        System.out.print("So hang cua tam giac= ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(k++);
            System.out.println("");
        }
    }
}
