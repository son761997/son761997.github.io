public class triangle {
    public static String printARightTriangle(int M) {
    StringBuilder result = new StringBuilder();
    for (int r = 1; r <= M; r++) {
        for (int j = 1; j <= r; j++) {
            result.append("*  ");
        }
        result.append(System.lineSeparator());
    }
    return result.toString();
}
}
