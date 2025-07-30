import java.util.*;

public class make_a_function_to_multiply_two_numbers_and_return_the_product {

    public static int calculateProduct(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of 2 number is " + calculateProduct(a, b));
    }

}
