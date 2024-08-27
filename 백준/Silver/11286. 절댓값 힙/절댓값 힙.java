import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);

                // 절댓값이 작은 순으로 우선순위 결정
                if (abs1 == abs2) {
                    return o1 - o2; // 절댓값이 같다면 실제 값이 더 작은 것을 우선
                }
                return abs1 - abs2; // 절댓값이 작은 순으로 정렬
            }
        });
        for (int i=0;i<N;i++) {
            int K = Integer.parseInt(br.readLine());
            if (K==0){
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(K);
            }
        }
    }
}
