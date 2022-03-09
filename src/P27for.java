import java.io.*;
import java.util.StringTokenizer;

public class P27for {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = Integer.parseInt(bufferedReader.readLine());
        for (int i=0; i<count; i++){
            String str = bufferedReader.readLine();
            st = new StringTokenizer(str);
            bufferedWriter.write("Case #"+(i+1)+": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
