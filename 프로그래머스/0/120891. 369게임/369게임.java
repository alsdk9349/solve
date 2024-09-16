class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int num = c-'0';
            if (num!=0 && num%3==0) {
                answer++;
            }
        }
        return answer;
    }
}