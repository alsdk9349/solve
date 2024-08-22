import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int [] inp = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            arr[i] = inp;
        }
        Arrays.sort(arr, Comparator.comparingInt((int[]o)->o[1])
                .thenComparingInt(o->o[0]));

        int result = 0;
        int finish = 0;
        for (int i=0;i<N;i++) {
            int [] next = arr[i];
            if (next[0]>=finish) {
                result++;
                finish = next[1];
            }
        }
        System.out.println(result);
    }
}