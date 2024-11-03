class Solution {
    public static int result = 0;
    public static int len = 0;
    public static int[] arr;
    public static void dfs(int level, int now, int sum) {
        if (level==2) {
            if (sum==0) {
                result++;
            }
            return;
        }
        for (int j=now+1;j<len;j++) {
            dfs(level+1, j, sum+arr[j]);
        }
    }
    public int solution(int[] number) {
        len = number.length;
        arr = new int[len];
        for (int i=0;i<len;i++) {
            arr[i] = number[i];
        }
        int answer = 0;
        for (int i=0;i<len;i++) {
            dfs(0,i,arr[i]);
        }
        return result;
    }
}