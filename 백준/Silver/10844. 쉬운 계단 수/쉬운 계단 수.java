import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[][] arr = new BigInteger[n+1][10];
        arr[1][0]=BigInteger.ZERO;
        for (int i=1;i<10;i++) {
            arr[1][i]=BigInteger.ONE;
        }
        if (n>1) {
            for (int i=2;i<n+1;i++) {
                arr[i][0]=arr[i-1][1];
                for (int j=1;j<9;j++) {
                    arr[i][j]=arr[i-1][j-1].add(arr[i-1][j+1]);
                }
                arr[i][9]=arr[i-1][8];
            }
        }

        BigInteger res = BigInteger.ZERO;
        for (int i=0;i<10;i++) {
            res = res.add(arr[n][i]);
        }
        System.out.println(res.remainder(BigInteger.valueOf(1000000000)));
    }
}