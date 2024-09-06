class Solution {
    public int solution(int[] array) {
        int len = array.length;
        int [] visit = new int[1001];
        int m = 0;
        boolean flag = false;
        int result = -1;
        for (int i=0;i<len;i++) {
            int k = ++visit[array[i]];
            if (k>m) {m = k; flag = false;result=array[i];}
            else if (k==m) {flag = true;}
        }
        
        int answer = -1;
        if (!flag) {
            answer = result;
        }
        return answer;
    }
}