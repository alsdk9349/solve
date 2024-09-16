class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String up = my_string.toUpperCase();
        for (int i=0;i<my_string.length();i++) {
            char c1 = my_string.charAt(i);
            char c2 = up.charAt(i);
            if (c1!=c2) {
                answer.append(c2);
            } else {
                answer.append(String.valueOf(c1).toLowerCase());
            }
        }
        return answer.toString();
    }
}