class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int a = sides[0];
        int b = sides[1];
        if (a>b) {
            int t = a;
            a = b;
            b = t;
        }
        for (int i=b+1;i<a+b;i++) {
            answer++;
        }
        for (int i=b-a+1;i<b;i++) {
            answer++;
        }
        return answer;
    }
}