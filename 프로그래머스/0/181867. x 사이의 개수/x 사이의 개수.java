import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        for (int i=0;i<myString.length();i++) {
            char c = myString.charAt(i);
            if (c=='x') {
                arr.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        arr.add(cnt);
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}