import java.awt.font.LayoutPath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int bfs(int s, int e) {
        int [] v = new int[200001];
        for (int i=0;i<200001;i++) {
            v[i]=(int)21e8;
        }
        int r = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((o1,o2) ->{ return (o1[1]-o2[1]);
        });
        q.offer(new int[]{s,r});
        while (!q.isEmpty()) {
            int [] now = q.poll();
            int p = now[0];
            int c = now[1];
            if (p==e) {
                r = c;
                break;
            } else {
                if (0<=p-1 && p-1<=200000 && v[p-1]>c+1) {
                    v[p-1]=c+1;
                    q.offer(new int[]{p-1,c+1});
                }
                if (p+1<=200000 && v[p+1]>c+1) {
                    v[p+1]=c+1;
                    q.offer(new int[]{p+1,c+1});
                }
                if (p*2<=200000 && v[p*2]>c) {
                    v[p*2]=c;
                    q.offer(new int[]{p * 2, c});
                }
            }
        }
        return r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(bfs(n,k));
    }
}