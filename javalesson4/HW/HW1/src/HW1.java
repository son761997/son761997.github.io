import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("3 cạnh hợp thành tam giác");
        } else {
            System.out.println("3 cạnh không hợp thành tam giác");
        }

    }
}
