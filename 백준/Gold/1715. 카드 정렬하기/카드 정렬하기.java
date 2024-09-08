import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0;i<N;i++) {
            int k = Integer.parseInt(br.readLine());
            pq.add(k);
        }
        int res = 0;
        while (pq.size()>1) {
            int a = pq.poll();
            int b = pq.poll();
            res+=a+b;
            pq.add(a+b);
        }
        System.out.println(res);
    }
}