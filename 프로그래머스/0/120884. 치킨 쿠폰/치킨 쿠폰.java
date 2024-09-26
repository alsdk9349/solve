class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken>9) {
            int s = chicken/10;
            answer+=s;
            chicken%=10;
            chicken+=s;
        }
        return answer;
    }
}