import java.util.Scanner;

public class P19if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();
        int fixtime = hour * 60 + minute + time;
        int newhour = fixtime/60;
        if(newhour>=24){
            newhour -= 24;
        }
        int newmin = fixtime%60;
        System.out.printf("%d %d", newhour, newmin);
    }
}