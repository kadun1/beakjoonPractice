import java.util.Scanner;

public class P16if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = (a%4==0&&(a%100!=0||a%400==0)) ? 1 : 0 ;
        System.out.println(b);
    }
}
