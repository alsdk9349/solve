class Solution {
    public int solution(int n) {
        int answer = 1;
        int mid=1;
        while (answer<n) {
            if (answer*mid+1>n) {
                break;
            }
            answer*=++mid;
        }
        return mid;
    }
}