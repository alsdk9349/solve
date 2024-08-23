
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int myl = my_string.length();
        int isl = is_suffix.length();
        StringBuilder sb = new StringBuilder();
        if (myl>=isl) {
            for (int i=myl-isl;i<myl;i++) {
            sb.append(my_string.charAt(i));
        }
        String st = sb.toString();
        if (st.equals(is_suffix)) {
            answer = 1;
        }
        }
        return answer;
    }
}