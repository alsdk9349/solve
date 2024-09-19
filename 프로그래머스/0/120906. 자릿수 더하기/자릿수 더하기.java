class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            answer+=(int)(c-'0');
        }
        return answer;
    }
}