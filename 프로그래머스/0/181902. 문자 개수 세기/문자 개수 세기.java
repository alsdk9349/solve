class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i=0;i<my_string.length();i++) {
            int num = my_string.charAt(i)-48-17;
            if (num>=26) {
                num-=6;
            }
            answer[num]++;
        }
        return answer;
    }
}