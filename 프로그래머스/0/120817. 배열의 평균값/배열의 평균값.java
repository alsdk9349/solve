class Solution {
    public double solution(int[] numbers) {
        int len = numbers.length;
        double answer = 0;
        for (int i=0;i<len;i++) {
            answer+=(double)numbers[i];
        }
        answer/=(double)len;
        return answer;
    }
}