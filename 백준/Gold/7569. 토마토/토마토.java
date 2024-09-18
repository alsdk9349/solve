import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int m;
    static int n;
    static int h;
    static int [][][] arr = new int[h][n][m];
    static int res = 0;

    static boolean find(int[][][] lst) {
        boolean flag = false;
        for (int k=0;k<h;k++) {
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (arr[k][i][j]==0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return flag;
    }

    static int []dih = {0,0,0,0,1,-1};
    static int []diy = {-1,1,0,0,0,0};
    static int [] dix = {0,0,1,-1,0,0};

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        for (int k=0;k<h;k++) {
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (arr[k][i][j]==1) {
                        q.offer(new int[]{k,i,j,0});
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int[]now=q.poll();
            for (int i=0;i<6;i++) {
                int nh = now[0]+dih[i];
                int ny = now[1]+diy[i];
                int nx = now[2]+dix[i];
                int c = now[3];
                if (0<=nh && nh<h && 0<=ny && ny<n && 0<=nx && nx<m && arr[nh][ny][nx]==0) {
                    arr[nh][ny][nx]=1;
                    q.offer(new int[]{nh,ny,nx,c+1});
                    res = c+1;
                }
            }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[h][n][m];
        for (int k=0;k<h;k++) {
            for (int i=0;i<n;i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0;j<m;j++) {
                    arr[k][i][j]=Integer.parseInt(st.nextToken());
                }
            }
        }

        if (find(arr)) {
            bfs();
            if (find(arr)) {
                res = -1;
            }
        }

        System.out.println(res);

    }
}