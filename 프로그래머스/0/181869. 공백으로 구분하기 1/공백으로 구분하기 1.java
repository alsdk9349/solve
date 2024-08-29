import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(my_string);
        ArrayList<String> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String s=st.nextToken();
            arr.add(s);
        }
        answer = arr.toArray(String[]::new);
        return answer;
    }
}