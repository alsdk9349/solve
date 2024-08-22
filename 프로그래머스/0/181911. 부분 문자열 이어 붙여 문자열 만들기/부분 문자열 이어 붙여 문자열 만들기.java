import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb;
        for (int i=0;i<my_strings.length;i++) {
             sb = new StringBuilder();
            for (int j=parts[i][0];j<=parts[i][1];j++) {
                char c = my_strings[i].charAt(j);
                sb.append(c);
            }
            answer+=sb.toString();
        }
        return answer;
    }
}