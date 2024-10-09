import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        long answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long start = 1;
        long end = 0;

        long [] arr = new long[k];
        for (int i=0;i<k;i++) {
            arr[i] = Long.parseLong(br.readLine());
            if (arr[i]>end) {
                end = arr[i];
            }
        }

        while (start<=end) {
            long mid = (start+end)/2;
            long count = 0;
            for (int i=0;i<k;i++) {
                count+=arr[i]/mid;

            }
            if (count<n) {
                end = mid-1;
            } else{
                start = mid+1;
                answer = mid;
            }
        }
        System.out.println(answer);
    }
}