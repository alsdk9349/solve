import java.util.*;
import java.io.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<score.length;i++) {
            pq.offer(score[i]);
        }
        while(pq.size()>0) {
            boolean flag = false;
            int[] arr = new int[m];
            for (int i=0;i<m;i++) {
                arr[i]=pq.poll();
                if (pq.size()==0) {
                    flag = true;
                    break;
                }
            }
            answer+=m*arr[m-1];
            if (flag) {
                break;
            }

        }
        return answer;
    }
}