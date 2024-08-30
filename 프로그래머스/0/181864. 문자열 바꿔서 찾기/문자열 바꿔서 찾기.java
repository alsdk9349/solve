class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<pat.length();i++) {
            char c = pat.charAt(i);
            if (c=='A') {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        pat = sb.toString();
        if (myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}