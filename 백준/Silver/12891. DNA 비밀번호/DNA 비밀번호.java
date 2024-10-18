import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int answer = 0;

        String se = br.readLine();
        int [] check = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<4;i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }
        int [] visit = new int[4];
        char c = se.charAt(0);
        int si = 0;
        if (c=='A') {
            si=0;
        } else if (c=='C') {
            si=1;
        } else if (c=='G') {
            si=2;
        } else {
            si=3;
        }
        for (int i=0;i<p;i++) {
            c = se.charAt(i);
            if (c=='A') {
                visit[0]++;
            } else if (c=='C') {
                visit[1]++;
            } else if (c=='G') {
                visit[2]++;
            } else {
                visit[3]++;
            }
        }
        boolean flag = false;
        for (int j=0;j<4;j++) {
            if (visit[j]<check[j]) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            answer++;
        }
        for (int i=1;i<=s-p;i++) {
            visit[si]--;

            c = se.charAt(i+p-1);
            if (c=='A') {
                visit[0]++;
            } else if (c=='C') {
                visit[1]++;
            } else if (c=='G') {
                visit[2]++;
            } else {
                visit[3]++;
            }

            flag = false;
            for (int j=0;j<4;j++) {
                if (visit[j]<check[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer++;
            }

            c = se.charAt(i);
            if (c=='A') {
                si=0;
            } else if (c=='C') {
                si=1;
            } else if (c=='G') {
                si=2;
            } else {
                si=3;
            }

        }


        System.out.println(answer);
    }
}