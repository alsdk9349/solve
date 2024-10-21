class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left;i<=right;i++) {
            double d = (double) i;
            double s = Math.sqrt(d);
            
            if (s%1==0) {
                answer-=i;
            } else {
                answer+=i;
            }
        }
        return answer;
    }
}