import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        Set<Integer> set = new TreeSet<>();
        for (int i=0;i<len;i++) {
            for (int j=i+1;j<len;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int index = 0;
        for (int num : set) {
            answer[index++] = num;
        }
        return answer;
    }
}