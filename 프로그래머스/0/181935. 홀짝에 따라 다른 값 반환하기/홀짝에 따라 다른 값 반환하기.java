class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2==0) {
            for (int i=2;i<=n;i+=2) {
                answer+=i*i;
            }
        } else {
            int sum = n * (n+1)/2;
            answer = (sum+n/2+1)/2;
        }
        return answer;
    }
}