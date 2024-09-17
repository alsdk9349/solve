import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                arr.add(i);
            }
        }
        int len = arr.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i]=arr.get(i);
        }
        return answer;
    }
}