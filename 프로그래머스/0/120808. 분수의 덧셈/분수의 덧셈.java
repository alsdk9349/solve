class Solution {
    static int gcd(int x, int y) {
        if (x%y==0) {
            return y;
        }
        return gcd(y, x%y);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        int k=0;
        if (a>b) {
            k = gcd(a,b); 
        } else {
            k = gcd(b,a);
        }
        a/=k;
        b/=k;
        answer[0]=a;
        answer[1]=b;
        
        return answer;
    }
}