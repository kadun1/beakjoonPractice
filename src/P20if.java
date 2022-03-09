import java.util.Arrays;
import java.util.Scanner;

public class P20if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int result = 0;
        int[] intArr = {one, two, three};

        if(one==two&&one==three){
            result = 10000 + one*1000;
        } else if(one==two||one==three){
            result = 1000 + one*100;
        } else if(two==three) {
            result = 1000 + two*100;
        } else {
            result = Arrays.stream(intArr).max().getAsInt() * 100;
        }
        System.out.println(result);
    }
}
