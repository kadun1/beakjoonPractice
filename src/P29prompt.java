import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P29prompt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
//        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        for (String s : strArr) {
            System.out.println("s = " + s);
        }
    }
}
