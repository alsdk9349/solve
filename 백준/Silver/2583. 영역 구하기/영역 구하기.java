import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[][] arr;
    static int M,N,S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new int[M+1][N+1];

        for (int i=0;i<K;i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int m=x1;m<x2;m++) {
                for (int n=y1;n<y2;n++) {
                    arr[m][n]=1;
                }
            }
        }

        int cnt =0;
        int [] result = new int[10000];
        for (int i=0;i<M;i++) {
            for (int j=0;j<N;j++) {
                if (arr[i][j]==0) {
                    arr[i][j]=1;
                    S = 1;
                    dfs(i,j);
                    result[cnt]=S;
                    cnt = cnt+1;
                }
            }
        }
        System.out.println(cnt);
        int [] pt = new int [cnt];
        for (int i=0;i<cnt;i++) {
            pt[i] = result[i];
        }
        Arrays.sort(pt);
        for (int i=0;i<cnt;i++) {
            System.out.print(pt[i]+" ");
        }

    }

    static int [] directx = {0,0,1,-1};
    static int [] directy = {1,-1,0,0};

    static void dfs(int x, int y) {
        for (int i=0;i<4;i++) {
            int dx = directx[i]+x;
            int dy = directy[i]+y;
            if (0<=dx && dx<M && 0<=dy && dy<N) {
                if (arr[dx][dy]==0) {
                    arr[dx][dy]=1;
                    S = S+1;
                    dfs(dx,dy);
                }
            }
        }
    }

}