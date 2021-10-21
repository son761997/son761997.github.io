import java.util.Scanner;

public class HW1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ ");
        int n = sc.nextInt();
        String result = n % 2 == 0 ? n + "là số chẵn" : n + " là số lẻ ";
        System.out.println(result);        
        
    }
}
