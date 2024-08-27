class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            int k = arr[i];
            if (k>=50 && k%2==0) {
                answer[i]=k/2;
            } else if (k<50 && k%2==1) {
                answer[i] =k*2;
            } else {
                answer[i]=k;
            }
        }
        return answer;
    }
}