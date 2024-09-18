import java.util.*;
import java.io.*;

class Solution {
    public int solution(String my_string) {
        Queue<String> arr = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(my_string);
        long n = Long.parseLong(st.nextToken());
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            long k = Long.parseLong(st.nextToken());
            if (s.equals("+")) {
                n+=k;
            } else {
                n-=k;
            }
        }
        int answer = (int)n;
        return answer;
    }
}