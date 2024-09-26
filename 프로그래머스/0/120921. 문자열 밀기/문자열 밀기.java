class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        int answer = -1;
        for (int i=0;i<len;i++) {
            boolean f = true;
            for (int j=0;j<len;j++) {
                if (A.charAt(j)!=B.charAt((j+i)%len)) {
                    f=false;
                    break;
                }
            }
            if (f) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}