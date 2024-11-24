class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int [] visit = new int[n];
        for (int i=0;i<section.length;i++) {
            visit[section[i]-1]=1;
        }
        for (int i=0;i<n;i++) {
            if (visit[i]==1) {
                answer++;
                System.out.println(i);
                for (int j=0;j<m;j++) {
                    if (i+j>=n) {
                        break;
                    } else {
                        visit[i+j]=0;
                    }
                }
            }
        }
        return answer;
    }
}