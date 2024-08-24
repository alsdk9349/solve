import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);
        int now = 0;
        for (int i=0;i<my_string.length();i++) {
            if (now<indices.length && i==indices[now]) {
                now++;
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}