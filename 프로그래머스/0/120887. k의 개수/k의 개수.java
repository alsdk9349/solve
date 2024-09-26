class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n=i;n<j+1;n++) {
            char [] c = String.valueOf(n).toCharArray();
            for (int m =0;m<c.length;m++) {
                if (c[m]-'0'==k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}