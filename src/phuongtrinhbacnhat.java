import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }

        } else {
            x = -b / a;
            System.out.println("Có nghiệm x =" + x);
        }
    }
}