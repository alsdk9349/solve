import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long [] arr = new long[N];

        st = new StringTokenizer(br.readLine());
        long min = 0;
        long max = (long)-21e8;

        for (int i=0;i<N;i++) {
            long k = Long.parseLong(st.nextToken());
            arr[i] = k;
            if (k>max) {
                max = k;
            }
        }

        long answer = 0;
        long budget = Long.parseLong(br.readLine());
        while (min<=max) {
            long result = 0;
            long now = budget;
            long mid = (min+max)/2;
            for (int j=0;j<N;j++) {
                if (arr[j]<mid) {
                    now-=arr[j];
                    result+=arr[j];
                } else {
                    now-=mid;
                    result+=mid;
                }
            }
            if (now>=0) {
                answer =mid;
                min = mid+1;

            } else {
                max = mid-1;
            }
        }
        System.out.println(answer);
    }
}