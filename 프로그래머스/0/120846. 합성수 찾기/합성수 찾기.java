class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] arr = new int[101];
        for (int i=1;i<101;i++) {
            for (int j=1;j*i<101;j++) {
                arr[i*j]++;
            }
        }
        
        for (int i=0;i<n+1;i++) {
            if (arr[i]>=3) {
                answer++;
            }
        }
        return answer;
    }
}