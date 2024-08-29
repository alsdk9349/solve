import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0;i<strArr.length;i++) {
            if (!strArr[i].contains("ad")) {
                arr.add(strArr[i]);
            }
        }
        int len = arr.size();
        String[] answer = new String[len];
        for (int i=0; i<len;i++) {
            answer[i]=arr.get(i);
        }
        return answer;
    }
}