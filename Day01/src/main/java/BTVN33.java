import java.util.Scanner;

public class BTVN33 {
    public static void main(String[] args) {
        double S=0,n,i=1;
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.print("Nhập giá trị n= ");
            n=in.nextInt();
            if(n>=1){
                break;
            }
            else {
                System.out.println("n không phải số nguyên dương");
            }
            System.out.println("Mời bạn nhập lại n");

        }
        System.out.print("Kết quả S= ");
        while (i<=n)
        {
            S=Math.sqrt(2+S);
            i++;
        }
        System.out.print(S);
    }
}
