import java.io.*;
import java.util.StringTokenizer;

public class P28for {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = Integer.parseInt(bufferedReader.readLine());
        for (int i=0; i<count; i++){
            String str = bufferedReader.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bufferedWriter.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
