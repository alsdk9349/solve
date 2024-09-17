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
        if (T>1) {
            result[1]=arr[0]+arr[1];
        }
        if (T>2) {
            result[2]=Math.max(result[0]+arr[2],arr[1]+arr[2]);
        }
        if (T>3) {
            for (int i=3;i<T;i++) {
                result[i]=Math.max(result[i-2]+arr[i],result[i-3]+arr[i-1]+arr[i]);
            }
        }
        
        System.out.println(result[T-1]);
    }
}