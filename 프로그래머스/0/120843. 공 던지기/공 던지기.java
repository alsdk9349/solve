class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int answer =(2*(k-1))%len+1;
        return answer;
    }
}