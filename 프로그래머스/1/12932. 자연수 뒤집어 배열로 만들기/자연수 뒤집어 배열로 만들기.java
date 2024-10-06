class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n); 
        int len = s.length();
        
        int[] answer = new int[len];
        for(int i=0,j=len-1;i<len;i++,j--) {
            answer[i] = s.charAt(j)-'0';
        }
        return answer;
    }
}