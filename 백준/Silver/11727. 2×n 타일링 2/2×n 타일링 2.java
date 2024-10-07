import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger [] arr = new BigInteger[n];

        arr[0] = BigInteger.ONE;
        if (n>1) {
            arr[1] = BigInteger.valueOf(3);
        }
        if (n>2) {
            for (int i=2;i<n;i++){
                arr[i] = arr[i-1].add(arr[i-2].multiply(BigInteger.TWO));
            }
        }

        BigInteger answer = arr[n-1];

        int r = answer.remainder(BigInteger.valueOf(10007)).intValue();

        System.out.println(r);
    }
}