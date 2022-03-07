import java.util.Scanner;

public class Exercise17 {
    // Write a Java program to display Pascal's triangle
    //    1
    //   1 1
    //  1 2 1
    // 1 3 3 1
    //1 4 6 4 1
    public static void main(String[] args) {
        int n,c=1,blk,i,j;
        System.out.print("Nhap so hang cua tam giac:n= ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            for(blk=1;blk<=n-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
