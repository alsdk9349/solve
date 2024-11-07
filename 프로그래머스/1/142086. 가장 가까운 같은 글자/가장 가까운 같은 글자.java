import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0;i<len;i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                int k = hm.get(c);
                answer[i]=i-k;
                hm.put(c,i);
            } else {
                hm.put(c,i);
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}