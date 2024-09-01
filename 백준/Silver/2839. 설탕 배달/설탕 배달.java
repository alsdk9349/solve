import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = false;
        int result = 0;
        result+=N/5;
        N = N%5;
        if (N%3==0) {
            System.out.println(result+N/3);
        } else {
            for (int i=1;i<=result;i++) {
                int count = result-i;
                int rest = N + i * 5;
                count+=rest/3;
                rest=rest%3;
                if (rest==0) {
                    System.out.println(count);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}