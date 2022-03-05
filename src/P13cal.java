import java.util.Scanner;

public class P13cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int b_first = b%10;
        int b_second = (b/10)%10;
        int b_third = b/100;
        System.out.println(a*b_first);
        System.out.println(a*b_second);
        System.out.println(a*b_third);
        System.out.println(a*b);
    }
}
