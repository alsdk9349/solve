import java.awt.font.LayoutPath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long res = 0;
        long start = 1;
        long end = n;
        long sum = n*(n+1)/2;
        while (start<=end) {
            if (sum==n) {
                res++;
                sum-=start;
                start++;
            } else if (sum<n) {
                end++;
                sum+=end;
                sum-=start;
                start++;

            } else {
                sum-=end;
                end--;
            }
        }
        System.out.println(res);
    }
}