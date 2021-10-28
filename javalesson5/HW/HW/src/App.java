import java.util.Scanner;


public class App {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số thứ tự HW :");
        int number = sc.nextInt();
        switch (number) {
        case 1:
        String word = "Hello every one";
        String guess = "e";
        int index = word.indexOf(guess);
        while(index >= 0) {
   System.out.println("index của ký tự e :"+ index);
   index = word.indexOf(guess, index + 1);
}
            System.out.println("ký tự e xuất hiện " + HW1.countLetter() + " lần");
            break;
       
        case 2:
            Scanner sc1 = new Scanner(System.in);
            System.out.println("nhập strA:");
            String strA = sc1.next();
            System.out.println("nhập strB:");
            String strB = sc1.next();

            System.out.println("vị trí của strB trong strA là :" + HW2.find(strA, strB));
            break;
        case 3:
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Nhập string :");
            String input = sc2.nextLine();
            System.out.println( "từ dài nhất là :" + HW3.longestWord(input));
            break;
        }



    }
}

