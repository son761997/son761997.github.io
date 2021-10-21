import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số thứ tự HW :");
        int number = sc.nextInt();
        switch (number) {
        case 1:
            System.out.println("kiểm tra 3 cạnh có phải là 3 cạnh của 1 tam giác");

        case 2:
            System.out.println("xếp hạng điểm trung bình học sinh");
        case 3:
            System.out.println("tính x với phương trình :  ax2 + bx + c = 0 với a != 0 ");

        }
    }
}
