import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<numbers.length;i++) {
            pq.add(numbers[i]);
        }
        int one = pq.poll();
        int two = pq.poll();
        return one*two;
    }
}