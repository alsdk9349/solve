class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long p = (long) price;
        long m = (long) money;
        for (int i=0;i<count;i++) {
            m-=(i+1)*p;
        }
        if (m<0) {
            answer = (long)Math.abs(m);
        }

        return answer;
    }
}