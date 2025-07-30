
import java.util.*;

public class zero_and_one_triangle_pattern_using_nested_loop {

    public static void main(String[] args) {
        int n = 5;

        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { // EVEN VALUE
                    System.out.print("1 ");

                } else { // ODD VALUE
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}