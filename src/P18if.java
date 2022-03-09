import java.util.Scanner;

public class P18if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        if(hour==0&&minute<45){
            hour=24;
        }
        int fixtime = hour * 60 + minute - 45;
        int newhour = fixtime/60;
        int newmin = fixtime%60;
        System.out.printf("%d %d", newhour, newmin);
    }
}
