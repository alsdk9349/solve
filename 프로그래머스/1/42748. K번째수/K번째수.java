import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j=commands[i][0]-1;j<commands[i][1];j++) {
                pq.add(array[j]);
            }
            int k = pq.poll();
            for (int j=0;j<commands[i][2]-1;j++) {
                k = pq.poll();
            }
            answer[i] = k;
        }
        return answer;
    }
}