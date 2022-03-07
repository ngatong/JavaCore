import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap so thang tu 1 den 12 : ");
        month = sc.nextInt();
        System.out.print("Moi ban nhap so nam: ");
        int year = input.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
            System.out.println("thang " + month + "nam " + year + " có 31 ngay" );
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            System.out.println("thang " + month + "nam" + year + " có 30 ngay");
        }
        else if ( month == 2 )

        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("thang " + month + "nam " + year + " có 29 ngay");
            } else {
                System.out.println("thang " + month + " nam" + year + " có 28 ngay");
            }
        }
        else
            System.out.println("Moi ban nhap lai");
    }
}
