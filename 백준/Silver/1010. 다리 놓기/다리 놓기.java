import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int [][] arr = new int [31][31];
        for (int i=1;i<31;i++) {
            arr[i][i] = 1;
            arr[1][i] = i;
        }
        for (int i = 2;i<31;i++) {
            for (int j=i+1;j<31;j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i][j-1];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(arr[n][m]);
        }
    }
}