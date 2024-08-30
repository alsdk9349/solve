import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<myString.length();i++) {
            char c = myString.charAt(i);
            if (c=='x') {
                        if (sb.length()!=0) {
            arr.add(sb.toString());  
        }
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        if (sb.length()!=0) {
            arr.add(sb.toString());  
        }
        answer = arr.toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}