class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            int [] now = queries[i];
            int result = 1000001;
            for (int j=now[0];j<=now[1];j++) {
                int next = arr[j];
                if (next >now[2] && next<result) {
                    result = next;
                }
            }
            if (result==1000001) {
                result = -1;
            }
            answer[i] = result;
        }
        return answer;
    }
}