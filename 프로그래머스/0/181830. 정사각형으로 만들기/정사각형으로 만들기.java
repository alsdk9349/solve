class Solution {
    public int[][] solution(int[][] arr) {
        
        int[][] answer = {};
        
        int hl = arr.length;
        int yl = arr[0].length;
        
        boolean flag = true;
        if (hl>yl) {
            flag = false;
        }
        
        if (flag) {
            answer = new int[yl][yl];
        } else {
            answer = new int[hl][hl];
        }
        
        for (int i=0;i<hl;i++) {
            for (int j=0;j<yl;j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}