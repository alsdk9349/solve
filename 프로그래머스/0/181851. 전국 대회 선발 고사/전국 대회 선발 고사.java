import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int []o1, int []o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        
        for (int i=0;i<attendance.length;i++) {
            if (attendance[i]==true) {
                pq.add(new int[]{rank[i],i});
            }
        }
        
        int answer = 0;
        answer += pq.poll()[1]*10000;
        answer += pq.poll()[1]*100;
        answer += pq.poll()[1];
        
        return answer;
    }
}