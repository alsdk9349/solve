class Solution {
    public long solution(long n) {
        long answer = -1;
        double m = Math.sqrt(n);
        if (m%1==0) {
            answer = (long) ((m+1) * (m+1));
        }
        return answer;
    }
}