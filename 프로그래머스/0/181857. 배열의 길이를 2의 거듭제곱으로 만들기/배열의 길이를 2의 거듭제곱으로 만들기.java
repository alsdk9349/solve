class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = {};
        int len = arr.length;
        int two = 1;
        while (len/two>=1) {
            if (len/two<=1 && len%two==0) {
                break;
            }
            two*=2;
        }
        if (len%two!=0) {
            answer = new int[two];
            for (int i=0;i<len;i++) {
                answer[i] = arr[i];
            }
            for (int i=len;i<two;i++){
                answer[i] = 0;
            }
        } else {
            answer = new int[len];
            for (int i=0;i<len;i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}