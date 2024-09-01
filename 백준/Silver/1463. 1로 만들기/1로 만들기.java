import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[1000001];
        bfs(N);
        System.out.println(result-1);
    }
    static int N;
    static int [] dp;
    static int result = 1;
    static void bfs(int x) {
        Queue<int[]> q = new LinkedList<>();
        dp[x]=1;
        q.offer(new int []{x,1});
        while (!q.isEmpty()) {
            int [] arr = q.poll();
            int now = arr[0];
            int count = arr[1];
            if (now==1) {
                result =count;
                break;
            }
            if (now%3==0 && dp[now/3]==0) {
                dp[now/3]= count +1;
                q.add(new int[]{now/3,count+1});
            }
            if (now%2==0 && dp[now/2]==0) {
                dp[now/2]= count +1;
                q.add(new int[]{now/2,count+1});
            }
            if (dp[now-1]==0) {
                dp[now-1]= count +1;
                q.add(new int[]{now-1,count+1});
            }
        }
    }
}