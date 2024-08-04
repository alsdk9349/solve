import java.io.IOException;

class Solution {
    public long[] solution(int x, int n) throws IOException {
        long[] answer = {};
        answer = new long[n];
        for (int i=0;i<n;i++) {
            answer[i] =(long)  x+ (long)x*i;
        }
        return answer;
    }
}