import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        for (int i=0;i<len;i++) {
            StringTokenizer st = new StringTokenizer(quiz[i]);
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            int y = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int z = Integer.parseInt(st.nextToken());
            if (c=='+') {
                if (x+y==z) {
                    answer[i]="O";
                } else {
                    answer[i]="X";
                }
            } else {
                if (x-y==z) {
                    answer[i]="O";
                } else {
                    answer[i]="X";
                }
            }
        }
        return answer;
    }
}