import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
         int n = Integer.parseInt(br.readLine());
         int[]na = new int[n];
         st = new StringTokenizer(br.readLine());
         for (int i=0;i<n;i++) {
             na[i]=Integer.parseInt(st.nextToken());
         }
         Arrays.sort(na);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<m;i++) {
            int answer = 0;
            int k =Integer.parseInt(st.nextToken());
            int start = 0;
            int end = n-1;
            while (start<=end) {
                int mid = (start+end)/2;
                if (k==na[mid]) {
                    answer=1;
                    break;
                } else if (k<na[mid]) {
                    end = mid-1;
                } else {
                    start = mid +1;
                }
            }
            System.out.println(answer);
        }
    }
}