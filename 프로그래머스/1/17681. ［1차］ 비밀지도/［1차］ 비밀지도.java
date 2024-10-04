class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int [][] map = new int[n][n];
        for (int i=0;i<n;i++) {
            String s = Integer.toBinaryString(arr1[i]);
            int len = s.length();
            for (int j=len-1,k=n-1;j>=0;j--,k--) {
                if (s.charAt(j)=='1') {
                    map[i][k]=1;
                }
            }
            s = Integer.toBinaryString(arr2[i]);
            len = s.length();
            for (int j=len-1,k=n-1;j>=0;j--,k--) {
                if (s.charAt(j)=='1') {
                    map[i][k]=1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<n;j++) {
                if (map[i][j]==1) {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}