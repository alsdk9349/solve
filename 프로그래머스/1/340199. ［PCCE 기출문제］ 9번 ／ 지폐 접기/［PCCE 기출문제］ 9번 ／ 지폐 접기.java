class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (true) {
            if (wallet[0]>wallet[1]) {
                int tem = wallet[0];
                wallet[0] = wallet[1];
                wallet[1] = tem;
            }
            if (bill[0]>bill[1]) {
                int mid = bill[0];
                bill[0] = bill[1];
                bill[1] = mid;
            }
            if (bill[0]<=wallet[0] && bill[1]<=wallet[1]) {
                break;
            }
            answer++;
            bill[1]/=2;
        }
        return answer;
    }
}