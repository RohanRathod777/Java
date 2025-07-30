import java.util.*;

public class holo_rectangle_pattern_using_nested_loop {

    public static void main(String[] args) {  
        int n = 4;
        int m = 5;
        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= m; j++) {
                // CELL -->(i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

