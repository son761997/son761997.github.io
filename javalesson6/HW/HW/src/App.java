
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số thứ tự bài tập :");
        int number = sc.nextInt();
        switch (number) {
        case 1:
            System.out.print("Nhập số phần tử của mảng: ");

            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng: \n");
            for (int i = 0; i < n; i++) {
                System.out.printf("phần tử [%d] =", i);
                arr[i] = sc.nextInt();
            }

            System.out.println("phần tử lớn nhất là :" + hw2.findMax(arr));
            System.out.println("phần tử nhỏ nhất là :" + hw2.findMin(arr));
            System.out.print("Các phần tử của mảng: ");
            hw1.show(arr);
        case 2:
        
            System.out.print("Nhập tổng số phương tiện: ");
            int m = sc.nextInt();
            Verhicle[] listVerhicles = new Verhicle[m];
            System.out.println("Nhập thông tin phương tiện: \n");
            for (int i = 0; i < m; i++) {
                
                
                
                System.out.println("mã số :");
                int number1 = sc.nextInt();
                System.out.println("Tên phương tiện :");
                String name = sc.next();
                 System.out.println("Tốc độ tối đa (km/h) :");
                int maxSpeed = sc.nextInt();
                Verhicle verhicle = new Verhicle(number1, name, maxSpeed);
                    listVerhicles[i] = verhicle;
            }
            for (Verhicle v : listVerhicles) {
                System.out.println(v);
            }
        }

    }
}
