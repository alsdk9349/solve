import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        int [] res = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
            res[i]=1;
        }
        for (int i=1;i<n;i++) {
            for (int j=0;j<i;j++) {
                if (arr[j]<arr[i] && res[i]<res[j]+1) {
                    res[i]=res[j]+1;
                }
            }
        }
        int m = (int)-21e8;
        for (int i=0;i<n;i++) {
            if (res[i]>m) {
                m = res[i];
            }
        }

        System.out.println(m);

    }
}