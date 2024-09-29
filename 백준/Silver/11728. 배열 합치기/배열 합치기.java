import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());
         int[]a = new int[n];
         int[]b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<m;i++) {
            b[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int p = 0;
        int q = 0;
        while (p<n || q<m) {
            if (p>=n) {
                sb.append(b[q++]+" ");
            } else if (q>=m) {
                sb.append(a[p++]+" ");
            } else if (a[p]<=b[q]) {
                sb.append(a[p++]+" ");
            } else {
                sb.append(b[q++]+" ");
            }
        }
        System.out.println(sb.toString());
    }
}