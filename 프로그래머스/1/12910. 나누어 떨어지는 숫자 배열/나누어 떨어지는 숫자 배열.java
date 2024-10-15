import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%divisor==0) {
                pq.add(arr[i]);
            }
        }
        int len = pq.size();
        if (len==0) {
            return new int[]{-1};
        }
        int[] answer = new int[len];
        for (int i=0; i<len;i++) {
            answer[i] = pq.poll();
        }
        return answer;
    }
}