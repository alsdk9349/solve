import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr= new int[N][N];
        StringTokenizer st;
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(result);

    }
    static int[][] arr;
    static String result = "Hing";
    static int N;
    static void dfs(int y, int x) {
        if (y==N-1 && x==N-1) {
            result = "HaruHaru";
            return;
        }
        int move = arr[y][x];
        if (move==0) {
            return;
        }
        if (move+x<N) {
            dfs(y,x+move);
        }
        if (move+y<N) {
            dfs(y+move,x);
        }
    }
}