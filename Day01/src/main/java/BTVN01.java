import java.util.Scanner;

public class BTVN01 {
    public static void main(String[] args) {
        int S=0,n,i=1;
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.print("Nhập giá trị n= ");
            n=in.nextInt();
            if(n>0){
                break;
            }
            else {
                System.out.println("n không phải số nguyên dương");
            }
            System.out.println("Mời bạn nhập lại n");
        }
        while (i<=n)
        {
            S=S+i;
            i++;
        }
        System.out.println(S);
    }
}
