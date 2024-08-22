import java.util.*;
import java.io.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb;
        for (int i=0;i<queries.length;i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            sb = new StringBuilder();
            for (int j=0;j<start;j++) {
                sb.append(my_string.charAt(j));
            }
            for (int j=end;start<=j;j--) {
                sb.append(my_string.charAt(j));
            }
            for (int j=end+1;j<my_string.length();j++) {
                sb.append(my_string.charAt(j));
            }
            my_string = sb.toString();
        }
        answer = my_string;
        return answer;
    }
}