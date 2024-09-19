class Solution {
    public int solution(int num, int k) {
        char m = (char)(k+'0');
        String s = String.valueOf(num);
        int answer = -1;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c==m) {
                return i+1;
            }
        }
        return answer;
    }
}