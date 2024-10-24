class Solution {
    public boolean solution(String s) {
        int len = s.length();
        boolean answer = true;
        if (len!=4 && len!=6) {
            return false;
        }
        for (int i=0;i<len;i++) {
            int n = s.charAt(i)-'0';
            System.out.println(n);
            if (n<0 || n>9) {
                return false;
            }
        }
        return answer;
    }
}