import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int result=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if (N>1) {

            for (int i=0;i<N-1;i++) {
                int K = Integer.parseInt(br.readLine());
                pq.add(K);
            }
            int now = pq.poll();
            while (now>=M) {
                M++;
                now--;
                result++;
                pq.add(now);
                now = pq.poll();
            }
        }
        System.out.println(result);
    }
}
