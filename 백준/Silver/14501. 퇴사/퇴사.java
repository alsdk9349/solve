import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [][] arr = new int[T][2];
        int [] res = new int[T+1];
        int m=0;
        StringTokenizer st;
        for (int i=1;i<T+1;i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken())+i-1;
            int r = Integer.parseInt(st.nextToken());
            if (d<T+1) {
                if (res[i-1]+r>res[d]) {
                    res[d]=res[i-1]+r;
                    if (res[d]>m) {
                        m=res[d];
                    }
                }
            }
            if (res[i]<res[i-1]) {
                res[i]=res[i-1];
            }
            if (res[i]>m) {
                m=res[i];
            }
        }


        System.out.println(m);
    }
}