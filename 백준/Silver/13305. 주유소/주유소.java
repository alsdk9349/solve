import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] distance = new int[N-1];
        for (int i=0;i<N-1;i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        int[] price = new int[N-1];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N-1;i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        int mini = (int) 21e8;
        int result = 0;

        for (int i=0;i<N-1;i++) {
            if (price[i]<mini) {
                mini = price[i];
            }
            result+=mini*distance[i];
        }

        System.out.println(result);
    }
}
