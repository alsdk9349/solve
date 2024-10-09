class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int now = x;
        int sum = 0;
        while (now>0) {
            sum+=now%10;
            now/=10;
        }
        if (x%sum!=0) {
            answer=false;
        }
        return answer;
    }
}