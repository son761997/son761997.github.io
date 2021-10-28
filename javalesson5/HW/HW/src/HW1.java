public class HW1 {
    static int countLetter() {
        String str = "Hello every one";
        String letter = "e";
        String a[] = str.split("");
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (letter.equals(a[i]))
                count++;
        }
        return count;
    }
    
   
}
