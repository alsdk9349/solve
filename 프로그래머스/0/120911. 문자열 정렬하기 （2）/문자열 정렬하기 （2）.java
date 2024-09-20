import java.util.*;
import java.io.*;

class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        int len = s.length();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (int i=0;i<len;i++) {
            pq.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<len;i++) {
            sb.append(pq.poll());
        }
        String answer = sb.toString();
        return answer;
    }
}