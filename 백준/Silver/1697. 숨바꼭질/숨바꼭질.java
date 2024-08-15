import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bfs(N, K);
    }
    static boolean [] visited = new boolean[100001];
    static void bfs(int start, int end) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start,0});
        visited[start] = true;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowind = now[0];
            int nowtime = now[1];
            if (nowind==end) {
                System.out.println(nowtime);
                break;
            }
            if (0<= nowind+1 && nowind+1<=100000 && !visited[nowind+1]) {
                visited[nowind+1] = true;
                q.offer(new int[]{nowind+1,nowtime+1});
            }
            if (0<= nowind-1 && nowind-1<=100000 && !visited[nowind-1]) {
                visited[nowind-1] = true;
                q.offer(new int[]{nowind-1,nowtime+1});
            }
            if (0<= nowind*2 && nowind*2<=100000 && !visited[nowind*2]) {
                visited[nowind*2] = true;
                q.offer(new int[]{nowind*2,nowtime+1});
            }
        }
    }
}