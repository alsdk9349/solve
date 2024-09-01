import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Arrays.sort(delete_list);
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            int num = arr[i];
            boolean flag = false;
            for (int j=0;j<delete_list.length;j++) {
                if (delete_list[j]==num) {
                    flag = true;
                    break;
                } else if (delete_list[j]>num) {
                    break;
                }
            }
            if (!flag) {
                lst.add(num);
            }
        }
        int len = lst.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i] = lst.get(i);
        }
        return answer;
    }
}