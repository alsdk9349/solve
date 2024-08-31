import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0]) {
                    return Integer.compare(o1[0],o2[0]);
                } else {
                    return Integer.compare(o1[1],o2[1]);
                }
            }
        });
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pq.add(new int[]{a,b});
        }
        PriorityQueue<Integer> ed = new PriorityQueue<>();
        int [] now = pq.poll();
        int na = now[0];
        int nb = now[1];
        ed.add(nb);
        while (!pq.isEmpty()) {
            now = pq.poll();
            na = now[0];
            nb = now[1];
            int ne = ed.poll();
            boolean flag = false;
            if (ne>na) {
                ed.add(ne);
                ed.add(nb);
            } else {
                ed.add(nb);
            }
        }
        System.out.println(ed.size());
    }
}