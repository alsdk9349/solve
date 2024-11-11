class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n>=a) {
            int tem = n/a;
            answer+=tem*b;
            n = tem*b + n%a;
        }
        return answer;
    }
}