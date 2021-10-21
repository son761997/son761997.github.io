import java.util.Scanner;

public class HW3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("nhập a với a khác 0: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        System.out.println("nhập c: ");
        double c = sc.nextDouble();
        double alpha = b * b - 4 * a * c;
        if (alpha > 0 && a!=0) {
            double x1 = (-1 * b + Math.sqrt(alpha)) / 2 * a;
            double x2 = (-1 * b - Math.sqrt(alpha)) / 2 * a;
            System.out.println("phương trình có 2 nghiệm: ");
            System.out.println("nghiệm x1: " + x1);
            System.out.println("nghiệm x2: " + x2);
        }
        if (alpha == 0 && a!=0) {
            double x = (-1 * b) / (2 * a);
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + x);
        }
        if (alpha < 0 && a!=0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if (a == 0) {
            System.out.println("bài toán sai vì điều kiện a phải khác 0");
        }
    }
}
