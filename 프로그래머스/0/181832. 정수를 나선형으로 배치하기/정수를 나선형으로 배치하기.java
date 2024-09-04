class Solution {
    public int[][] solution(int n) {
        int[] diy = {0,0,1,-1};
        int[] dix = {1,-1,0,0};
        int[][] answer = new int [n][n];
        int num = 1;
        answer[0][0] = num++;
        int nowy = 0;
        int nowx = 0;
        int nexty,nextx;
        boolean flag = true;
        while (flag) {
            boolean mid = false;
            for (int i=0;i<4;i++) {
                nexty = nowy +diy[i];
                nextx = nowx +dix[i];
                if (0<=nexty && nexty<n
                        && 0<=nextx && nextx<n
                        && answer[nexty][nextx]==0 ) {
                    while(0<=nexty && nexty<n
                            && 0<=nextx && nextx<n
                            && answer[nexty][nextx]==0) {
                        answer[nexty][nextx]=num++;
                        nexty+=diy[i];
                        nextx+=dix[i];
                    }
                    nowy = nexty-diy[i];
                    nowx = nextx-dix[i];
                    mid = true;
                    break;
                }
            }
            if (!mid) {
                flag = false;
                break;
            }
        }
        return answer;
    }
}