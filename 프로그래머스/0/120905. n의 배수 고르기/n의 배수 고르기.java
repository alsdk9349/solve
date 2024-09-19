import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=0;i<numlist.length;i++) {
            if(numlist[i]%n==0) {
                lst.add(numlist[i]);
            }
        }
        int len = lst.size();
        int[] answer = new int [len];
        for (int i=0;i<len;i++) {
            answer[i]=lst.get(i);
        }
        return answer;
    }
}