import java.util.*;

public class half_pyramid_pattern_using_nested_loop {

    public static void main(String[] args) {
        int n = 4;
        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
