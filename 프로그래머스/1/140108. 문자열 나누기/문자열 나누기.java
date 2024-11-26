class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int a = 1;
        int b = 0;
        boolean flag = false;
        for (int i=1;i<s.length();i++) {
            char now = s.charAt(i);
            if (c==now) {
                a++;
            } else {
                b++;
            }
            if (a==b) {
                answer++;
                if (i==s.length()-1) {
                    flag = true;
                    break;
                } else {
                    c = s.charAt(++i);
                    a = 1;
                    b = 0;
                }
            }
        }
        if (!flag) {
            answer++;
        }
        return answer;
    }
}