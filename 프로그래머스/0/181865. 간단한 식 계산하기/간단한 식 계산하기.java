import java.util.*;
import java.io.*;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int answer = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        if (s.equals("+")) {
            answer+=b;
        } else if (s.equals("-")) {
            answer-=b;
        } else if (s.equals("*")) {
            answer*=b;
        }
        return answer;
    }
}