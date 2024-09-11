import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][n];
        int [][] res = new int[n][n];
        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<i+1;j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        res[0][0] = arr[0][0];

        for (int i=1;i<n;i++) {
            res[i][0]=arr[i][0]+res[i-1][0];
            for (int j=1;j<i;j++) {
                res[i][j]=Math.max(arr[i][j]+res[i-1][j],arr[i][j]+res[i-1][j-1]);
            }
            res[i][i]=arr[i][i]+res[i-1][i-1];
        }

        int result = (int)-21e8;
        for (int i=0;i<n;i++) {
            if (res[n-1][i]>result) {
                result=res[n-1][i];
            }
        }
        System.out.println(result);
    }
}