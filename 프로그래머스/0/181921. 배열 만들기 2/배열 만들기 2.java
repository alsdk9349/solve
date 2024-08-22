import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        for(int i=l;i<=r;i++) {
            if (i%5==0) {
                String se = String.valueOf(i);
                boolean flag = true;
                for (int j=0;j<se.length();j++) {
                    char ch = se.charAt(j);
                    if (ch!='0' && ch!='5') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    arr.add(i);
                }
            }
        }
        answer = new int[arr.size()];
        for (int i=0;i<arr.size();i++) {
            answer[i] = arr.get(i);
        }
        if (arr.size()==0) {
            answer = new int[]{-1};
        }
        return answer;
    }
}