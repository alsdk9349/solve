class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        int[] answer = new int[b-a+d-c+2];
        for (int i=0,j=a;j<=b;i++,j++) {
            answer[i] = arr[j];
        } 
        for (int i=b-a+1,j=c;j<=d;i++,j++) {
            answer[i] = arr[j];
        }
        return answer;
    }
}