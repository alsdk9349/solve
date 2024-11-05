class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int num = c;
            if (65<=num && num<=90) {
                num+=n;
                if (num>90) {
                    num-=26;
                }
            } else if (97<=num && num<=122) {
                num+=n;
                if (num>122) {
                    num-=26;
                }
            }
            sb.append((char)num);
        }
        answer = sb.toString();
        return answer;
    }
}