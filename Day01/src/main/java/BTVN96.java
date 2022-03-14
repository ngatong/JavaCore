import java.util.Scanner;

public class BTVN96 {
    public static void main(String[] args) {
        float F=0f,x;
        Scanner in=new Scanner(System.in);
        System.out.print("Nhập x= ");
        x=in.nextFloat();
        System.out.print("Kết quả F= ");
        if(x>=5)
        {
            F=2*x*x+5*x+9;
            System.out.print(F);
        }
        else
        {
            F=-2*x*x+4*x-9;
            System.out.print(F);
        }
    }
}
