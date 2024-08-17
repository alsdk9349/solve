import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st= new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[R][C];
        visited = new boolean[R][C];
        String inp;
        for (int i=0;i<R;i++) {
            inp = br.readLine();
            for (int j=0;j<C;j++) {
                arr[i][j] = inp.charAt(j);
            }
        }
        visited[0][0] = true;
        checked[arr[0][0]-'A'] = true;
        dfs(0,0,1,visited,checked);
        System.out.println(result);
    }
    static int R,C;
    static int [][] arr;
    static boolean [][] visited;
    static boolean [] checked = new boolean[26];
    static int result = 1;
    static int [] directy = new int[]{0,0,1,-1};
    static int [] directx = new int[]{1,-1,0,0};
    static void dfs(int y, int x, int count, boolean[][]visit, boolean[] check) {
        if (count>result) {
            result = count;
        }
        for (int i=0;i<4;i++) {
            int nexty = y + directy[i];
            int nextx = x + directx[i];
            if (0<=nexty && nexty<R && 0<=nextx && nextx<C && !visit[nexty][nextx] && !check[Integer.valueOf(arr[nexty][nextx])-65]) {
                visit[nexty][nextx] = true;
                check[arr[nexty][nextx]-'A'] = true;
                dfs(nexty,nextx,count+1,visit,check);
                visit[nexty][nextx] = false;
                check[arr[nexty][nextx]-'A'] = false;
            }
        }
    }
}