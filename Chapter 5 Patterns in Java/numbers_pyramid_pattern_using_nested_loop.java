public class numbers_pyramid_pattern_using_nested_loop {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // NUMBERS -->PRINT ROW NO ,ROW NO TIMES
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
