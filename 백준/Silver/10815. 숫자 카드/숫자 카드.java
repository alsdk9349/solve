import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] na = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            na[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(na);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<M;i++) {
            int now = Integer.parseInt(st.nextToken());
            int res = 0;
            int start = 0;
            int end = N-1;
            while (start<=end) {
                int mid = (start+end)/2;
                if (na[mid]==now) {
                    res = 1;
                    break;
                } else if (na[mid]<now) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
            System.out.print(res+" ");
        }
    }
}