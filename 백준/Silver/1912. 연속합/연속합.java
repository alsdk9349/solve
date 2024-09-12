import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[T];
        int ma = (int) -21e8;
        for (int i=0;i<T;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i]>ma) {
                ma = arr[i];
            }
        }
        int res = 0;
        boolean flag = true;
        for (int i=0;i<T;i++) {
            res+=arr[i];
            if (res>ma) {
                ma = res;
                flag = false;
            } else if (res<0) {
                res=0;
            }
        }
//        if (flag) {
//            res = ma;
//        }
        System.out.println(ma);

    }
}