class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n+1)/2];
        for (int i=0,j=1;i<(n+1)/2;i++,j+=2) {
            answer[i]=j;
        }
        return answer;
    }
}