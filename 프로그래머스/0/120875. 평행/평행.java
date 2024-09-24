class Solution {
    public int solution(int[][] dots) {
        for (int i=0;i<3;i++) {
            if ((double)(dots[i][0]-dots[3][0])/(dots[i][1]-dots[3][1])==(double)(dots[(i+1)%3][0]-dots[(i+2)%3][0])/(dots[(i+1)%3][1]-dots[(i+2)%3][1])) {
                return 1;
            }
        }
        return 0;
    }
}