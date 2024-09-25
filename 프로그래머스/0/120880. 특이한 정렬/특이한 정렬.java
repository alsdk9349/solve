import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->{
            if (o1[0]==o2[0]) {
                return o2[1]-o1[1];
            }
            return o1[0]-o2[0];
        });
        
        for (int i =0;i<len;i++) {
            pq.add(new int[]{Math.abs(numlist[i]-n),numlist[i]});
        }
        
        int[] answer = new int [len];
        for (int i =0;i<len;i++) {
            answer[i] = pq.poll()[1];
        }
        return answer;
    }
}