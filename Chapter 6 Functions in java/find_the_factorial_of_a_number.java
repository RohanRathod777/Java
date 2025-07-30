import java.util.*;

public class find_the_factorial_of_a_number {

    public static void printFactorial(int n) {
        // loop
        int factorial = 1;
        if (n < 0) {
            System.out.println("INVALIL NUMBER..!!");
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}