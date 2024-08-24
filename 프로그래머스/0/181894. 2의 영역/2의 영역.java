class Solution {
    public int[] solution(int[] arr) {
        int a = -1;
        int b = -1;
        boolean flag = false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==2 && !flag) {
                a = i;
                flag = true;
            } else if (arr[i]==2) {
                b = i;
            }
        }
        int[] answer = {};
        if (a==-1) {
            answer = new int[]{-1};
        } else {
            if (b==-1) {
                answer = new int[]{2};
            } else {
                answer = new int[b-a+1];
                for (int i=a;i<=b;i++) {
                    answer[i-a] = arr[i];
                }
            }
        }
        
        return answer;
    }
}