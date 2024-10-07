import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i=0; i<N;i++) {
            String s = st.nextToken();
            hashMap.put(s, hashMap.getOrDefault(s,0) +1);
        }

       int M = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());
       for (int i=0;i<M;i++) {
           String t = st.nextToken();
           System.out.println(hashMap.getOrDefault(t,0));

       }
    }
}
