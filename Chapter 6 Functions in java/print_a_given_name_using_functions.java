import java.util.*;

public class print_a_given_name_using_functions {

    public static void printMyName(String name) {
        System.out.println(name);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);

    }
}
