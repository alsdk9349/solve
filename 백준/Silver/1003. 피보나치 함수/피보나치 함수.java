import java.io.*;
import java.util.*;

public class Main {

    static void fibonacci(int n) {
        if (n == 0) {
            result[n][0]++;
        } else if (n == 1) {
            result[n][1]++;
        }
        result[n][0] += result[n-1][0]+result[n-2][0];
        result[n][1] += result[n-1][1]+result[n-2][1];

    }
    static int[][] result = new int[41][2];

    public static void main(String[] args) throws IOException {
        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;
        for (int i=2;i<41;i++) {
            fibonacci(i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.print(result[N][0]+" ");
            System.out.print(result[N][1]);
            System.out.println();
        }

    }
}
