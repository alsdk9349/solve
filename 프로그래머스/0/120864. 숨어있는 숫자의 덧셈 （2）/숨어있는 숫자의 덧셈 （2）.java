class Solution {
    public int solution(String my_string) {
        int res = 0;
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length()>0) {
                    answer+=Long.parseLong(sb.toString());
                    sb=new StringBuilder();
                }
            }
        }
        if (sb.length()>0) {
            answer += Long.parseLong(sb.toString());
        }
        res = (int) answer;
        return res;
    }
}