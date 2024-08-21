
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;
        List<Integer> arr=new ArrayList<>();
        for (int i=0;i<N;i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin<=K) {
                arr.add(coin);
                count++;
            }
        }
        for (int i=count-1;i>=0;i--) {
            int now = arr.get(i);
            result+= K/now;
            K = K%now;
            if (K==0) {
                break;
            }
        }
        System.out.println(result);
    }
}