class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int llen = num_list.length;
        n-=1;
        int len =llen-n;
        answer = new int[len];
        for (int i=n;i<llen;i++) {
            answer[i-n]=num_list[i];
        }
        return answer;
    }
}