class Solution {
    public String solution(String my_string, String alp) {
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<len;i++) {
            char c = my_string.charAt(i);
            String s = String.valueOf(c);
            if (s.equals(alp)) {
                s=s.toUpperCase();
            }
            sb.append(s);
        }
        String answer = sb.toString();
        return answer;
    }
}