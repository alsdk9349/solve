class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        boolean flag = false;
        for (int i = idx;i<arr.length;i++) {
            if (arr[i]==1) {
                answer = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            answer = -1;
        }
        return answer;
    }
}