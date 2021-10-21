import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số x: ");
        float x = sc.nextFloat();
        System.out.println("nhập vào số y: ");
        float y = sc.nextFloat();
        System.out.println("x+y =" + (x + y));
        System.out.println("x+y =" + (x - y));
        System.out.println("x+y =" + (x * y));
        System.out.println("x+y =" + (x / y));
    }
    
}
