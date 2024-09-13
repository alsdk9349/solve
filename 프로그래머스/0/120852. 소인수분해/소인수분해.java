import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=2;i<=n;i++) {
            boolean flag = false;
            while (n%i==0) {
                flag = true;
                n/=i;
            }
            if (flag) {
                pq.add(i);
            }
        }
        int len = pq.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i]=pq.poll();
        }
        return answer;
    }
}