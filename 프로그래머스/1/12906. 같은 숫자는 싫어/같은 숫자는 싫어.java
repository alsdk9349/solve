import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        int k = (int)21e8;
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<arr.length;i++) {
            int now = arr[i];
            if (now!=k) {
                q.offer(now);
                k=now;
            }
        }
        int len = q.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}