class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[]a1 = new int[200];
        int[]a2 = new int[200];
        for (int i=0;i<before.length();i++) {
            char c = before.charAt(i);
            a1[c-'0']++;
            c = after.charAt(i);
            a2[c-'0']++;
        }
        for (int i=0;i<200;i++) {
            if (a1[i]!=a2[i]) {
                return 0;
            }
        }
        return answer;
    }
}