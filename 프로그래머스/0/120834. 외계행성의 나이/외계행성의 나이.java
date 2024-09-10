class Solution {
    public String solution(int age) {
        String num = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<num.length();i++) {
            char c = num.charAt(i);
            char d = (char) (c-'0' +97);
            sb.append(d);
        }
        String answer = sb.toString();
        return answer;
    }
}