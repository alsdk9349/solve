class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        int check = 'l'-'0';
        for (int i=0; i<myString.length();i++) {
            char c = myString.charAt(i);
            int num = c-'0';
            if (num<check) {
                sb.append('l');
            } else {
                sb.append(c);
            }
        }
        String answer = sb.toString();

        return answer;
    }
}