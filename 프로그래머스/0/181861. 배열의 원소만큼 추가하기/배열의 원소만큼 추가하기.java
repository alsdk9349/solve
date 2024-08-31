import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = 0;
        for (int i =0;i<arr.length;i++) {
            len+=arr[i];
        }
        answer = new int[len];
        int ind = 0;
        for (int i=0;i<arr.length;i++) {
            int k = arr[i];
            for (int j=0;j<k;j++) {
                answer[ind++]=k;
            }
        }
        return answer;
    }
}