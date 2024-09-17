class Solution {
    public String solution(String s) {
        int [] arr = new int[200];
        int len = s.length();
        for (int i=0;i<len;i++) {
            int num =s.charAt(i);
            arr[num]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<200;i++) {
            if (arr[i]==1) {
                sb.append((char)i);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}