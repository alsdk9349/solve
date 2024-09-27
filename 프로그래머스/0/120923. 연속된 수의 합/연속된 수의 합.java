class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = (num-1)/2;
        answer[mid]=total/num;
        for (int i=mid+1;i<num;i++) {
            answer[i]=answer[i-1]+1;
        }
        for (int i=mid-1;i>=0;i--) {
            answer[i]=answer[i+1]-1;
        }   
        return answer;
    }
}