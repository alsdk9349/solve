import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=0;i<flag.length;i++) {
            int k = arr[i];
            if (flag[i]==true) {
                for (int j=0;j<2*k;j++) {
                    lst.add(k);
                }
            } else {
                for (int j=0;j<k;j++) {
                    lst.remove(lst.size()-1);
                }
            }
        }
        int len = lst.size();
        answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i] = lst.get(i); 
        }
        return answer;
    }
}