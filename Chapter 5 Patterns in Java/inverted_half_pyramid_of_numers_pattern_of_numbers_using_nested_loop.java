
import java.util.*;

public class inverted_half_pyramid_of_numers_pattern_of_numbers_using_nested_loop {

    public static void main(String[] args) {
        int n = 5;
        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }
}
