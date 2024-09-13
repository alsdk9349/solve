class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            int num = c-'0';
            if (0<=num && num<=9) {
                answer+=num;
            }
        }
        return answer;
    }
}