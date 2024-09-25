import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        Double [] answer = new Double[len];
        Double [] result = new Double[len];
        int [] fin = new int[len];
        for (int i=0;i<len;i++) {
            answer[i]=(score[i][0]+score[i][1])/2.0;
            result[i]=(score[i][0]+score[i][1])/2.0;
        }
        Arrays.sort(result, Collections.reverseOrder());
        for (int i=0;i<len;i++) {
            for (int j=0;j<len;j++) {
                if (answer[i].equals(result[j])) {
                    fin[i]=j+1;
                    break;
                }
            }
        }
        return fin;
    }
}