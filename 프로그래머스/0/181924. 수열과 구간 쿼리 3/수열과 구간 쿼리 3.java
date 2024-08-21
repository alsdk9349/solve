class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i=0;i<queries.length;i++) {
            int [] now = queries[i];
            int mid = arr[now[0]];
            arr[now[0]] = arr[now[1]];
            arr[now[1]] = mid;
        }
        answer = arr;
        return answer;
    }
}