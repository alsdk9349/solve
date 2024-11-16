class Solution {
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int [] cnt = new int[number+1];
        for (int i=1;i<number+1;i++) {
            for (int j=1;j*j<i+1;j++) {
                if (j*j==i) {
                    cnt[i]++;
                } else if (i%j==0) {
                    cnt[i]+=2;
                }
            }
        }
        for (int i=1;i<number+1;i++) {
            if (cnt[i]>limit) {
                answer+=power;
            } else {
                answer+=cnt[i];
            }
        }
        return answer;
    }
}