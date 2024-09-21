class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int l = (len+n-1)/n;
        String[] answer = new String[l];
        for (int i=0;i<l;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<n;j++) {
                if (i*n+j<len) {
                    sb.append(my_str.charAt(i*n+j));                    
                }
            }
            answer[i]=sb.toString();
        }
        return answer;
    }
}