import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] arr = new int[T];
        for (int i=0;i<T;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[]result = new int[T];
        result[0]=arr[0];
        if (T==1) {
            System.out.println(arr[0]);
            return;
        }
        if (T==2) {
            System.out.println(arr[0]+arr[1]);
            return;
        }

        result[1]=arr[0]+arr[1];
        int m = result[1];

        result[2]= Math.max(arr[0]+arr[2],arr[1]+arr[2]);
        if (arr[0]+arr[1]>result[2]) {
            result[2] = arr[0]+arr[1];
        }
        if (result[2]>m) {
            m=result[2];
        }

        for (int i=3;i<T;i++) {
            result[i]=Math.max(result[i-2]+arr[i],result[i-3]+arr[i-1]+arr[i]);
            if (arr[i-1]==0) {
                if (result[i-1]+arr[i]>result[i]) {
                    result[i]=result[i-1]+arr[i];
                }
            }
            if (arr[i-2]==0) {
                if (result[i-2]+arr[i-1]+arr[i]>result[i]) {
                    result[i]=result[i-2]+arr[i-1]+arr[i];
                }
            }
            if (result[i-3]+arr[i]>result[i]) {
                result[i]=result[i-3]+arr[i];
            }
            if (result[i-1]>result[i]) {
                result[i] = result[i-1];
            }
            if (result[i]>m) {
                m = result[i];
            }
        }
        System.out.println(m);
    }
}