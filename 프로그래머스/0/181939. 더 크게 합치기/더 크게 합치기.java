import java.util.*;
import java.io.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = "";
        str1+=String.valueOf(a); 
        str1+=String.valueOf(b);
        answer = Integer.parseInt(str1);
        String str2 = "";
        str2+=String.valueOf(b); 
        str2+=String.valueOf(a);
        int answer2 = Integer.parseInt(str2);
        if (answer2>answer) {
            answer = answer2;
        }
        return answer;
    }
}