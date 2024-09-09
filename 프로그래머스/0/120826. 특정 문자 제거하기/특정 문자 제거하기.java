class Solution {
    public String solution(String my_string, String letter) {
        char l = letter.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if (c!=l) {
                sb.append(c);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}