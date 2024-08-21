class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i=1;i<numLog.length;i++) {
            int check = numLog[i]-numLog[i-1];
            if (check==1) {
                answer+="w";
            } else if (check==-1) {
                answer+="s";
            } else if (check==10) {
                answer+="d";
            } else {
                answer+="a";
            }
        }
        return answer;
    }
}