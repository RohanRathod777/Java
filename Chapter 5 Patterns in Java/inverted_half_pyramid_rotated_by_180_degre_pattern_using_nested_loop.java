//import java.util.*;

public class inverted_half_pyramid_rotated_by_180_degre_pattern_using_nested_loop {

    public static void main(String[] args) {
        int n = 4;
        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP-->PRINT SPACE
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
