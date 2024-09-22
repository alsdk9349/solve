class Solution {
    public int solution(int[][] dots) {
        int y=dots[0][0];
        int x=dots[0][1];
        int answer = 0;
        for (int i=1;i<4;i++) {
            int ny = dots[i][0];
            int nx = dots[i][1];
            if (ny!=y && nx!=x) {
                answer = Math.max(ny-y,y-ny) * Math.max(nx-x,x-nx);
                break;
            }
        }
        return answer;
    }
}