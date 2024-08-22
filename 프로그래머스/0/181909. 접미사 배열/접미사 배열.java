import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringBuilder sb;
        int len = my_string.length();
        answer = new String[len];
        for (int i=0;i<len;i++) {
            sb = new StringBuilder();
            for (int j=i;j<len;j++) {
                sb.append(my_string.charAt(j));
            }
            answer[i] = sb.toString();
        }
        Arrays.sort(answer);
        return answer;
    }
}