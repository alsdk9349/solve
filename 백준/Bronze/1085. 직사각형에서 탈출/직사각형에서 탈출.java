import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int res = (int)21e8;

        if (a<res) {
            res = a;
        }
        if (b<res) {
            res = b;
        }
        if (c-a<res) {
            res = c-a;
        }
        if (d-b<res) {
            res = d-b;
        }
        System.out.println(res);
    }
}