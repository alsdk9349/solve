class Solution {
    public int solution(int[][] board) {
        int [] diy = new int[]{-1,-1,-1,0,0,1,1,1};
        int [] dix = new int[]{-1,0,1,1,-1,-1,0,1};
        int len = board.length;
        for (int i=0;i<len;i++) {
            for (int j=0;j<len;j++) {
                if (board[i][j]==1) {
                    for (int k=0;k<8;k++) {
                        int y = i+diy[k];
                        int x = j+dix[k];
                        if (0<=y && y<len && 0<=x && x<len && board[y][x]!=1) {
                            board[y][x]=2;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i=0;i<len;i++) {
            for (int j=0;j<len;j++) {
                if (board[i][j]==0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}