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
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new String[N][M];
        for (int i=0;i<N;i++) {
            String sentence = br.readLine();
            for (int j=0;j<M;j++) {
                arr[i][j] = String.valueOf(sentence.charAt(j));
            }
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                if (arr[i][j].equals("-") || arr[i][j].equals("|")) {
                    dfs(i,j);
                }
            }
        }
        System.out.println(count);
    }
    static String [][] arr;
    static int count = 0;
    static int N;
    static int M;
    static void dfs(int indy, int indx) {
        if (arr[indy][indx].equals("-")) {
            arr[indy][indx]="0";
            if (indx+1 < M && arr[indy][indx+1].equals("-")) {
                dfs(indy,indx+1);
            } else if (indx+1<M) {
                count+=1;
                dfs(indy, indx+1);
            } else {
                count+=1;
            }
        } else if (arr[indy][indx].equals("|")) {
            arr[indy][indx]="0";
            if (indy+1<N && arr[indy+1][indx].equals("|")) {
                dfs(indy+1, indx);
            } else if (indy+1<N) {
                count+=1;
            } else {
                count+=1;
            }
        }
    }
}