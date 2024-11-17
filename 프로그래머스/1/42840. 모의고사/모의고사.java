import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;
        int[]check = new int[3];

        Queue<Integer>[] q = new Queue[3];

        q[0] = new LinkedList<>();
        q[1] = new LinkedList<>();
        q[2] = new LinkedList<>();
        
        for (int i=1;i<6;i++) {
            q[0].offer(i);
        }
        q[1].offer(2);
        q[1].offer(1);
        q[1].offer(2);
        q[1].offer(3);
        q[1].offer(2);
        q[1].offer(4);
        q[1].offer(2);
        q[1].offer(5);
        
        q[2].offer(3);
        q[2].offer(3);
        q[2].offer(1);
        q[2].offer(1);
        q[2].offer(2);
        q[2].offer(2);
        q[2].offer(4);
        q[2].offer(4);
        q[2].offer(5);
        q[2].offer(5);
        
        int[] res = new int[3];
        
        for (int i=0;i<len;i++) {
            int answer = answers[i];
            for (int j=0;j<3;j++) {
                int now = q[j].poll();
                if (answer == now) {
                    res[j]++;
                }
                q[j].offer(now);
            }
        }
        int maxi = (int)-21e8;
        for (int i=0;i<3;i++) {
            if (res[i]>maxi) {
                maxi = res[i];
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<3;i++) {
            if (res[i]==maxi) {
                al.add(i);
            }
        }
        int rl = al.size();
        int []result = new int[rl];
        for (int i=0;i<rl;i++) {
            result[i] = al.get(i)+1;
        }

        return result;
    }
}