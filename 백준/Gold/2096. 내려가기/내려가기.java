import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][]arr = new int[N][3];
        StringTokenizer st;
        for (int i=0;i<N;i++) {
             st = new StringTokenizer(br.readLine());
             for (int j=0;j<3;j++) {
                 arr[i][j] = Integer.parseInt(st.nextToken());
             }
        }

        int answer = (int)-21e8;
        int [][] res = new int[N][3];
        res[0][0] = arr[0][0];
        res[0][1] = arr[0][1];
        res[0][2] = arr[0][2];
        for (int i=1;i<N;i++) {
            res[i][0] = Math.max(res[i-1][0],res[i-1][1]) + arr[i][0];
            res[i][1] = Math.max(res[i-1][0],res[i-1][1]) + arr[i][1];
            if (res[i-1][2]+arr[i][1]>res[i][1]) {
                res[i][1] = res[i-1][2] + arr[i][1];
            }
            res[i][2] = Math.max(res[i-1][2],res[i-1][1]) + arr[i][2];
        }
        for (int i=0;i<3;i++) {
            if (res[N-1][i]>answer) {
                answer = res[N-1][i];
            }
        }
        System.out.print(answer+" ");

        answer = (int) 21e8;
        res[0][0] = arr[0][0];
        res[0][1] = arr[0][1];
        res[0][2] = arr[0][2];
        for (int i=1;i<N;i++) {
            res[i][0] = Math.min(res[i-1][0],res[i-1][1]) + arr[i][0];
            res[i][1] = Math.min(res[i-1][0],res[i-1][1]) + arr[i][1];
            if (res[i-1][2]+arr[i][1]<res[i][1]) {
                res[i][1] = res[i-1][2] + arr[i][1];
            }
            res[i][2] = Math.min(res[i-1][2],res[i-1][1]) + arr[i][2];
        }
        for (int i=0;i<3;i++) {
            if (res[N-1][i]<answer) {
                answer = res[N-1][i];
            }
        }
        System.out.println(answer);
    }
}
