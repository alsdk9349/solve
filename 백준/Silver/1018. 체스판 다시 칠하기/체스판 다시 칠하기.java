import java.io.*;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer min = 32;
        char [][] answer = new char[8][8];
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++) {
                if ((i+j)%2==0) {
                    answer[i][j]="W".charAt(0);
                } else {
                    answer[i][j]="B".charAt(0);
                }
            }
        }
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(st.nextToken());
        Integer M = Integer.parseInt(st.nextToken());
        char [][] arr = new char[N][M];
        for (int i=0;i<N;i++) {
            String sen = br.readLine();
            for (int j=0;j<M;j++) {
                arr[i][j] = sen.charAt(j);
            }
        }
        for (int i=0;i<=N-8;i++) {
            for (int j=0;j<=M-8;j++) {
                char [][] now = new char[8][8];
                for (int k=0;k<8;k++) {
                    for (int l=0;l<8;l++) {
                        now[k][l] = arr[i+k][j+l];
                    }
                }
                // 8*8 하나씩 자름
                Integer check = 0;
                for (int m=0;m<8;m++) {
                    for (int n=0;n<8;n++) {
                        if (now[m][n]!=answer[m][n]) {
                            check++;
                        }
                    }
                }
                if (check>32) {
                    check=64-check;
                }
                if (check<min) {
                    min = check;
                }

            }
        }
        System.out.println(min);

    }
}