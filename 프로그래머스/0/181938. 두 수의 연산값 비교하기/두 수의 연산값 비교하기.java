class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String st = Integer.toString(a);
        st+=Integer.toString(b);
        answer = Integer.parseInt(st);
        int answer2 = 2*a*b;
        if (answer2>answer) {
            answer = answer2;
        }
        return answer;
    }
}