import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int result=(int)21e8;
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][3];
        int [][] dp = new int[N][3];

        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<3;j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for (int j=0;j<3;j++) {
            dp[0][j] = arr[0][j];
        }

        for (int i=1;i<N;i++) {
            for (int j=0;j<3;j++) {
                int a;
                int b;
                if (j==0) {
                    a = 1;
                    b = 2;
                } else if (j==1) {
                    a = 0;
                    b = 2;
                } else {
                    a = 0;
                    b = 1;
                }
                dp[i][j]=Math.min(dp[i-1][a],dp[i-1][b]) + arr[i][j];
            }
        }

        for (int i=0;i<3;i++) {
            if (dp[N-1][i]<result) {
                result = dp[N-1][i];
            }
        }
        System.out.println(result);
    }
}