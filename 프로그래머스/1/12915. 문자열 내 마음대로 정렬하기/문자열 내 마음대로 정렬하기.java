import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];
        PriorityQueue<String[]> pq = new PriorityQueue<>((a,b)->{
            int com = a[0].compareTo(b[0]);
            if (com!=0) {
                return com;
            }
            return a[1].compareTo(b[1]);
            });
        for (int i=0;i<len;i++) {
            char c = strings[i].charAt(n);
            String s = String.valueOf(c);
            pq.offer(new String[]{s, strings[i]});
        }
        for (int i=0;i<len;i++) {
            answer[i]=pq.poll()[1];
        }
        return answer;
    }
}