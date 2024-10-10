class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a==b) {
            return a;
        }
        int ma = Math.max(a,b);
        int mi = Math.min(a,b);
        long k = ma+mi;
        int len = ma-mi+1;
        if (len%2==1) {
            return ((k)/2)*len;            
        } else {
            return (k)*(len/2);
        }

    }
}