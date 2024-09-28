import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        long m =Long.parseLong(st.nextToken());
        long [] arr = new long[n];
        long min = 0L;
        long max = (long) -21e8;
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            long k =Long.parseLong(st.nextToken());
            if (k>max) {
                max = k;
            }
            arr[i]=k;
        }

        long res = 0;
        while (min<=max) {
            long mid = (min+max)/2;
            long tree = 0;
            for (int i=0;i<n;i++) {
                if (arr[i]>mid) {
                    tree+=arr[i]-mid;
                }
            }
            if (tree==m) {
                res = mid;
                break;
            } else if (tree>m) {
                res = mid;
                min = mid+1;
            } else {
                max = mid-1;
            }
        }
        System.out.println(res);
    }
}