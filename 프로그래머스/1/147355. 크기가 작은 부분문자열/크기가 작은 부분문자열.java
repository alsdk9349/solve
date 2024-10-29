class Solution {
    public int solution(String t, String p) {
        int tlen = t.length();
        int plen = p.length();
        long num = Long.parseLong(p);
        int answer = 0;
        for (int i=0;i<tlen-plen+1;i++) {
            String s = t.substring(i,i+plen);
            long now = Long.parseLong(s);
            if (now<=num) {
                answer++;
            }
        }
        return answer;
    }
}