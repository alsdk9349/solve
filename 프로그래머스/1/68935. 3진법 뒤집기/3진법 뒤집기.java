import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {
        Stack<Integer> q = new Stack<>();
        while(n>0) {
            q.add(n%3);
            n/=3;
        }
        
        int answer = 0;
        int count = 0;
        while (!q.isEmpty()) {
            answer+=Math.pow(3,count)*q.pop();
            count++;
        }
        return answer;
    }
}