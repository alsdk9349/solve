class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int cnt = 0;
        for (int i=0;i<arr.length;i++) {
            answer+=(double)arr[i];
            cnt++;
        }
        answer = answer/cnt;
        return answer;
    }
}