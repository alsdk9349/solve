import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<s.length();i++) {
            pq.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            sb.append(pq.poll());
        }
        String answer = sb.toString();
        return answer;
    }
}