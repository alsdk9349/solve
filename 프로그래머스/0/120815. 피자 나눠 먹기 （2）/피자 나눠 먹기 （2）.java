class Solution {
    static int gcd (int a, int b) {
        if (a%b==0) {
            return b;
        }
        return gcd(b, a%b);
    }
    public int solution(int n) {
        int k = 0;
        if (n==6) {
            return 1;
        } else if (n<6) {
            k = gcd(6, n);
        } else {
            k = gcd(n,6);
        }
        int answer = n/k;
        return answer;
    }
}