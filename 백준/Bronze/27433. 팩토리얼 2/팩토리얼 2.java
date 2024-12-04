import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());

        if (N==0) {
            N = 1;
        } else {
            for (long i=N-1;i>0;i--) {
                N*=i;
            }
        }

        System.out.println(N);
    }
}