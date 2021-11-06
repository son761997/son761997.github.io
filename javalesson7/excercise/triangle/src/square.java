public class square {
    public static String printARightSquare(int N) {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= N; r++) {
            for (int j = 1; j <= N; j++) {
                result.append("*  ");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}