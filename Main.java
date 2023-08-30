import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài a= ");
        a = sc.nextInt();


        System.out.println("Nhập vào chiều rộng b= ");
        b = sc.nextInt();

        // Thực hiện tính diện tích của hai số.
        int dientich = a*b;
        System.out.println(a+" * "+b+" = "+dientich);


        }
    }


