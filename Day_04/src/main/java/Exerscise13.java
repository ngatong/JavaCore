import java.util.Scanner;

public class Exerscise13 {
    //Write a Java program that keeps a number between 1 and 7 from the user and displays the name of the weekday
    public static void main(String[] args) {
        int chooseNumber;
        Scanner scanner = new Scanner(System.in);
        for (;;) {

            do {
                System.out.println("Nhap so tu 1 den 7: ");
                chooseNumber = scanner.nextInt();
            } while ((chooseNumber < 1) || (chooseNumber > 7));

            switch (chooseNumber) {
                case 1: System.out.println("So ban nhap la: Thứ Hai");break;
                case 2: System.out.println("So ban nhap la: Thứ Ba");break;
                case 3: System.out.println("So ban nhap la: Thứ Tư");break;
                case 4: System.out.println("So ban nhap la: Thứ Năm");break;
                case 5: System.out.println("So ban nhap la: Thứ Sáu");break;
                case 6: System.out.println("SSo ban nhap la: Thứ Bẩy");break;
                case 7: System.out.println("So ban nhap la: Chủ Nhật");break;
            }
        }
    }
}
