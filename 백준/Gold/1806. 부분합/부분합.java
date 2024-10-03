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

        int res = (int) 21e8;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            arr[i] =Long.parseLong(st.nextToken());
        }

        int s = 0;
        int e = 0;
        long now = arr[0];
        while (s<n) {
            if (now>=m) {
                if (e-s+1<res) {
                    res = e-s+1;
                }
                now-=arr[s];
                s++;
            } else {
                e++;
                if (e==n) {
                    now-=arr[s];
                    s++;
                    e--;
                } else {
                    now+=arr[e];
                }
            }
            if (s==n) {
                break;
            }
        }

        if (res==(int)21e8) {
            System.out.println(0);
        } else {
            System.out.println(res);
        }
    }
}