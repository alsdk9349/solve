class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if (M==1 && N==1) {
            return answer;
        } else if (M>1 && N==1) {
            return M-1;
        } else if (N>1 && M==1) {
            return N-1;
        } else {
            answer+=M-1;
            answer+=(N-1)*(M);
        }
        return answer;
    }
}