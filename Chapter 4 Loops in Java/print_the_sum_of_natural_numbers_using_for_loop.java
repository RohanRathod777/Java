import java.util.*;

public class print_the_sum_of_natural_numbers_using_for_loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;

        }

        System.out.println(sum);
    }
}