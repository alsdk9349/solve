import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> mid = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            mid.add(arr[i]);
        }
        List<Integer> result;
        for (int i=0;i<query.length;i++) {
            result = new ArrayList<>();
            if (i%2==0) {
                for (int j=0;j<=query[i];j++) {
                    result.add(mid.get(j));
                }
            } else {
                for (int j=query[i];j<mid.size();j++) {
                    result.add(mid.get(j));
                }
            }
            mid = result;
        }
        int len = mid.size();
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            answer[i] = mid.get(i);
        }
        return answer;
    }
}