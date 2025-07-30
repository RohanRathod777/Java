
import java.util.*;

public class floyds_triangle_pattern_of_numbers_using_nested_loop {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
