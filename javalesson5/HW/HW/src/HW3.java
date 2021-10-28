import java.util.Arrays;
import java.util.Comparator;

public class HW3 {
    static String longestWord(String input) {
        String s = input;
        String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        return longest;

    }
}
