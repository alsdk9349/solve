class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len1 = arr1.length;
        int len2 = arr1[0].length;
        int[][] answer = new int[len1][len2];
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr1[i].length;j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}