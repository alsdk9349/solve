import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String my_string) {
        
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        for (int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            int num = c-'0';
            if (0<=num && num<=9) {
                arr.add(num);
            }
        }
        int len = arr.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i] = arr.poll();
        }
        return answer;
    }
}