import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<len;i++) {
            pq.add(score[i]);
            int [] result = new int[k];
            boolean flag = false;
            for (int j=0;j<k;j++) {
                if (j>i) {
                    answer[i] = result[j-1];
                    flag = true;
                    break;
                }
                result[j] = pq.poll();
            }
            for (int j=0;j<k;j++) {
                if (j>i) {
                    break;
                }
                pq.add(result[j]);
            }
            if (!flag) {
                answer[i] = result[k-1];
            }
        }
        return answer;
    }
}