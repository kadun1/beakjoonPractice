import java.io.*;

public class P29prompt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        String[][] strings = new String[n][strArr.length];
        for (int i = 0; i < n; i++) {
            strings[i] = strArr[i].split("");
        }

        String[] resultArr = strings[0];

        for (int i = 1; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if(!strings[i-1][j].equals(strings[i][j])){
                    resultArr[j] = "?";
                    continue;
                } else {
                    if(!resultArr[j].equals("?")){
                        resultArr[j] = strings[i][j];
                    }
                }
            }
        }
        String result = "";
        for (String s: resultArr) {
            result += s;
        }
        System.out.println(result);
    }
}
