public class primeCheck {
    public static boolean isPrime(int n1) {  
       if (n1 <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n1); i++) {  
           if (n1 % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}
