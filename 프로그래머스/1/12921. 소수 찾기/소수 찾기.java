class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] visit = new int[1000001];
        for (int i=2;i<n+1;i++) {
            for (int j=1;j*i<1000001;j++) {
                visit[i*j]++;
            }
        }
        for (int i=2;i<n+1;i++) {
            if (visit[i]==1) {
                answer++;
            }
        }
        return answer;
    }
}