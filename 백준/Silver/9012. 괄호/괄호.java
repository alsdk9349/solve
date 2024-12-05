import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());

        for (int i=0;i<N;i++) {
            String s = br.readLine();
            int check = 0;
            for (int j=0;j<s.length();j++) {
                char c = s.charAt(j);
                if (c=='(') {
                    check++;
                } else if (c==')') {
                    check--;
                } else {
                    check = -1;
                }
                if (check<0) {
                    System.out.println("NO");
                    break;
                }
            }
            if (check==0) {
                System.out.println("YES");
            } else if (check>0) {
                System.out.println("NO");
            }
        }
    }
}