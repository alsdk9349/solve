class Solution {
    public int solution(int num) {
        long lnum = (long)num;
        int answer = 0;
        boolean flag = false;
        while (answer<500) {
            if (lnum==1) {
                return answer;
            } else if (lnum%2==0) {
                lnum/=2;
                answer++;
            } else {
                lnum*=3;
                lnum+=1;
                answer++;
            }
        }
        return -1;
    }
}