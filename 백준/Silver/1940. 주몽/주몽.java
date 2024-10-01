import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int s = 0;
        int e = n-1;

        int res = 0;
        while (s<e) {
            int sum = arr[s]+arr[e];
            if (sum==m) {
                res++;
                s++;
                e--;
            } else if (sum<m) {
                s++;
            } else {
                e--;
            }
        }

        System.out.println(res);
    }
}