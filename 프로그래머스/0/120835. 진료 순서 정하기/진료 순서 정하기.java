import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        PriorityQueue<int []> pq = new PriorityQueue<>((o1,o2) -> {
            return o2[0]-o1[0];
        });
        for (int i=0;i<len;i++) {
            pq.add(new int[]{emergency[i],i});
        }
        int[] answer = new int[len];
        int k=1;
        while (!pq.isEmpty()) {
            int [] arr = pq.poll();
            answer[arr[1]] = k++;
        }
        return answer;
    }
}