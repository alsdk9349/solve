class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int []directy = {1,-1,0,0};
        int []directx = {0,0,1,-1};
        for (int i=0;i<4;i++) {
            int nowy = h+directy[i];
            int nowx = w+directx[i];
            if (0<=nowy && nowy<n && 0<=nowx && nowx<n) {
                if (board[h][w].equals(board[nowy][nowx])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}