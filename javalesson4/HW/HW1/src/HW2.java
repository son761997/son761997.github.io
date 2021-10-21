import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán: ");
        double a = sc.nextDouble();
        System.out.println("nhập điểm văn: ");
        double b = sc.nextDouble();
        System.out.println("nhập điểm lý: ");
        double c = sc.nextDouble();
        System.out.println("nhập điểm hoá: ");
        double d = sc.nextDouble();
        double TBC = (a + b + c + d) / 4;
        if (TBC < 4.5) {
            System.out.println("Hạng yếu");
        }
        if (TBC >= 4.5 && TBC < 6.5) {
            System.out.println("Hạng trung bình");
        }
        if (TBC >= 6.5 && TBC < 8) {
            System.out.println("Hạng khá");
        }
        if (TBC >= 8 ) {
            System.out.println("Hạng giỏi");
        }
    }
}
