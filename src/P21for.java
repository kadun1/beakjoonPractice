import java.util.Scanner;

public class P21for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gugu = scanner.nextInt();
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",gugu, i, gugu*i);
        }
    }
}
