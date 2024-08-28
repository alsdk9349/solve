class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<myString.length();i++) {
            char c = myString.charAt(i);
            String s = String.valueOf(c);
            s = s.toUpperCase();
            sb.append(s);
        }
        answer = sb.toString();
        return answer;
    }
}