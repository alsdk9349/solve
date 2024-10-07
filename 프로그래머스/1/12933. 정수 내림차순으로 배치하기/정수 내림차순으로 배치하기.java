import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        while (n>0) {
            pq.offer(n%10);
            n/=10;
        }
        
        while (!pq.isEmpty()) {
            sb.append(String.valueOf(pq.poll()));
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}