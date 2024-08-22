import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int result = 0;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (flag && (c=='-' || c=='+')) {
                num = Integer.parseInt(sb.toString());
                result-=num;
                sb = new StringBuilder();
            } else if (c=='-') {
                flag = true;
                num = Integer.parseInt(sb.toString());
                result+=num;
                sb = new StringBuilder();
            } else if (c=='+') {
                num = Integer.parseInt(sb.toString());
                result+=num;
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        if (flag) {
            num = Integer.parseInt(sb.toString());
            result-=num;
        } else {
            num = Integer.parseInt(sb.toString());
            result+=num;
        }
        System.out.println(result);
    }
}