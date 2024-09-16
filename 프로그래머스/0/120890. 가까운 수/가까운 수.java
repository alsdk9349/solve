import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int len = array.length;
        int answer = 0;
        int ind = -1;
        for (int i=0;i<len;i++) {
            if (array[i]==n) {
                return n;
            } else if (array[i]>n) {
                ind = i;
                answer = array[i];
                break;
            }
        }
        if (ind==-1) {
            return array[len-1];
        } else if (ind==0) {
            return array[0];
        } else {
            if ((n-array[ind-1])<=(answer-n)) {
                return array[ind-1];
            } else {
                return answer;
            }
        }
    }
}