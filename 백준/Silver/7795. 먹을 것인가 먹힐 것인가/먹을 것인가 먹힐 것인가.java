import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int [] arr = new int[A];
            int [] brr = new int[B];
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<A;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<B;j++) {
                brr[j] = Integer.parseInt(st.nextToken());
            }
            int res = 0;
            Arrays.sort(arr);
            Arrays.sort(brr);
            int ai = 0;
            int bi = 0;

            while(ai<A) {
                if (arr[ai]>brr[bi]) {
                    res++;
                    bi++;
                } else {
                    ai++;
                    bi=0;
                }
                if (ai>=A) {
                    break;
                } else if (bi>=B) {
                    ai++;
                    bi=0;
                }
            }

            System.out.println(res);
        }



    }
}