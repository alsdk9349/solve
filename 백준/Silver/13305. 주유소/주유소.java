import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] distance = new long[N-1];
        for (int i=0;i<N-1;i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        long[] price = new long[N-1];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N-1;i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long mini = (long) 21e8;
        long result = 0;

        for (int i=0;i<N-1;i++) {
            if (price[i]<mini) {
                mini = price[i];
            }
            result+=mini*distance[i];
        }

        System.out.println(result);
    }
}