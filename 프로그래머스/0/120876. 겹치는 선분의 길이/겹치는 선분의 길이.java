class Solution {
    public int solution(int[][] lines) {
        int [] v = new int[300];
        for (int i=0;i<3;i++) {
            for (int j=lines[i][0];j<lines[i][1];j++) {
                v[j+100] ++;
            }
        }
        
        int answer = 0;
        int s=0;
        for (int i=0;i<300;i++) {
            if (v[i]>1) {
                answer++;
            }
        }
        return answer;
    }
}