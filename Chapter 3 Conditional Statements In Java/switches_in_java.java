import java.util.*;

public class switches_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button) {

            case 1:
                System.out.println("HELLO..!!");

                break;
            case 2:
                System.out.println("NAMASTE..!!");

                break;
            case 3:
                System.out.println("BONJOUR..!!");

                break;

            default:
                System.out.println("INVALID BUTTON..!!");
                break;
        }
    }
}
