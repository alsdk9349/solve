import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> lst = new ArrayList<>();
        int i=0;
        while(i<arr.length) {
            int len = lst.size();
            if (len==0) {
                lst.add(arr[i++]);
            } else {
                if (lst.get(len-1)<arr[i]) {
                    lst.add(arr[i++]);
                } else {
                    lst.remove(len-1);
                }
            }
        }
        int len2 = lst.size();
        stk = new int[len2];
        for (int q=0;q<len2;q++) {
            stk[q] = lst.get(q);
        }
        return stk;
    }
}