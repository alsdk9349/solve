import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int i = (int)21e8;
        int a = (int)-21e8;
        while (st.hasMoreTokens()) {
            int k = Integer.parseInt(st.nextToken());
            if (k<i) {
                i = k;
            }
            if (k>a) {
                a = k;
            }
        }
        return i + " " + a;
    }
}