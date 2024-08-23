class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        if (my_string.length()>is_prefix.length()) {
                    for (int i=0;i<is_prefix.length();i++) {
            sb.append(my_string.charAt(i));
        }
        if (is_prefix.equals(sb.toString())) {
            answer = 1;
        }
        }

        return answer;
    }
}