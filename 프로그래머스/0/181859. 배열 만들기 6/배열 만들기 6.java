import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int[] answer = {};
        for (int i=0;i<arr.length;i++) {
            int k = arr[i];
            int ind =stk.size()-1;
            if (stk.size()==0) {
                stk.add(k);
            } else if (stk.get(ind)==k) {
                stk.remove(ind);
            } else {
                stk.add(k);
            }
        }
        int result = stk.size();
        if (result==0) {
            answer = new int[]{-1};
        } else {
            answer = new int[result];
            for (int i=0;i<result;i++) {
                answer[i] = stk.get(i);
            }
        }
        return answer;
    }
}