import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length;
        String[] answer = new String[len*k];
        int ind = 0;
        for (int i=0;i<len;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<picture[i].length();j++) {
                for (int m=0;m<k;m++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            String st = sb.toString();
            for (int n=0;n<k;n++) {
                answer[ind++] = st;
            }
        }
        return answer;
    }
}