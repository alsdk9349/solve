class Solution {
    public String solution(String myString, String pat) {
        int blen = myString.length();
        int slen = pat.length();
        int ind = 0;
        for (int i=blen-1;i>slen-1;i--) {
            boolean flag = false;
            for (int j=0;j<slen;j++) {
                char b = myString.charAt(i-j);
                char s = pat.charAt(slen-j-1);
                if (b!=s) {
                    break;
                } else if (j==slen-1) {
                    ind = i-j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        String answer = myString.substring(0,ind+slen);
        return answer;
    }
}