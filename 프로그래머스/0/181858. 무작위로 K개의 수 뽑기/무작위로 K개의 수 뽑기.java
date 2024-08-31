class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int len = arr.length;
        int ind = 1;
        boolean []visited = new boolean[100002];
        visited[arr[0]] = true;
        answer[0] = arr[0];

        boolean flag = false;

        while (ind<k) {
            for (int i=1;i<len;i++) {
                if (!visited[arr[i]]) {
                    answer[ind++]=arr[i];
                    visited[arr[i]] = true;
                }
                if (ind==k) {
                    flag = true;break;
                }
            }
            if (flag) {
                break;
            }
            for (int i=ind;i<k;i++) {
                answer[i] = -1;
                ind++;
            }
        }
        return answer;
    }
}