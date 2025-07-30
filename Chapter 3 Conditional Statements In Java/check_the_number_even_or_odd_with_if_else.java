import java.util.*;

public class check_the_number_even_or_odd_with_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }
}