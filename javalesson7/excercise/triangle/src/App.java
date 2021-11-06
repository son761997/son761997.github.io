import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số thứ tự bài tập :");
        int number = sc.nextInt();
        switch (number) {
        case 1:
            int N = 4;
            System.out.println(triangle.printARightTriangle(N));
            int M = 4;
            System.out.println(square.printARightSquare(M));
            break;
        case 2:
            System.out.println("nhập tên cần chuẩn hoá và check Palindrome : ");
            String str = sc.nextLine();
            correctform cf = new correctform();
            str = cf.chuanHoaDanhTuRieng(str);
            System.out.println(str);
            System.out.println("Palindrome check : " + Palindrome.isPalindrome(str));
            break;
        case 3:
            int ct = 0, n = 0, i = 1, j = 1;
            while (n < 10) {
                j = 1;
                ct = 0;
                while (j <= i) {
                    if (i % j == 0)
                        ct++;
                    j++;
                }
                if (ct == 2) {
                    System.out.println("mười số nguyên tố đầu tiên là :" + i);
                    n++;
                }
                i++;
            }
            break;

        case 4:
            String primeNumbers = "";
            int  i1 = 0, j1 = 0;
            for (i1 = 1; i1 <= 10; i1++) {
                int ct1 = 0;
                for (j1 = i1; j1 >= 1; j1--) {
                    if (i1 % j1 == 0) {
                        ct1 = ct1 + 1;
                    }

                }
                if (ct1 == 2) {
                    primeNumbers = primeNumbers + i1 + " ";
                }

            }
          System.out.println("số nguyên tố nhỏ hơn 10 là :");
          System.out.println(primeNumbers);
          break;

        case 5:
            String str1 = "You only live once, but if you do it right, once is enough";
            int count = 0;
            System.out.println("String :" + str1);
            char temp;
            int totalCharo = 0;
            
      
            for (int i2 = 0; i2 < str1.length(); i2++) {
                temp = str1.charAt(i2);
                
                if (temp == 'o') {
                    totalCharo++;
                }
                if (Character.isLetter(str1.charAt(i2))) {
                    count++;
                }

            }
            System.out.println("total letters : " + count);
            System.out.println("kí tự o xuât hiện: " +totalCharo +"lần");
                    for (int index = str1.indexOf("o");
     index >= 0;
     index = str1.indexOf("o", index + 1))
{
    System.out.println("index của kí tự o là : "+index);
}

break;
case 6:
    Random rand = new Random();
    int upperbound = 10000;
    int int_random = rand.nextInt(upperbound);
    System.out.println("số ngẫu nhiên được sinh ra là: " + int_random);
    int n1 = int_random;
    System.out.println("số ngẫu nhiên có phải số nguyên tố không: " + primeCheck.isPrime(n1));
case 7:
    System.out.println("Nhập email");
    Scanner sc7 = new Scanner(System.in);
    String email = sc7.nextLine();
    
       System.out.println(email);
         EmailValidator validator = new EmailValidator();
        if (validator.validate(email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    case 8:
        
    }

   
        }
    
    }

    

