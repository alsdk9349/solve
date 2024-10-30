class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 1;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c==' ') {
                sb.append(' ');
                start = 1;
            } else {
                String now = String.valueOf(c);
                if (start%2==1) {
                    sb.append(now.toUpperCase());
                } else {
                    sb.append(now.toLowerCase());
                }
                start++;
            }
        }
        String answer = sb.toString();
        return answer;
    }
}