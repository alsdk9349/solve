import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length+n-1)/n;
        int[] answer = new int[len];
        for (int i=0,j=0;i<len;i++,j+=n) {
            answer[i]=num_list[j];
        }
        return answer;
    }
}