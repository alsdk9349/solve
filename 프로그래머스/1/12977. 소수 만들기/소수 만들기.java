import java.util.*;

class Solution {
    static List<Integer> results = new ArrayList<>();
    static int len = 0;
    static void dfs(int[] arr, int level, int sum, int ind) {
        if (level==2) {
            results.add(sum);
            return;
        }
        for (int j=ind+1;j<len;j++) {
            dfs(arr, level+1, sum+arr[j], j);
        }
    }
    
    public int solution(int[] nums) {
        int answer = 0;

        len = nums.length;
        
        for (int i=0;i<len;i++){
            dfs(nums, 0, nums[i], i);
        }
        for (int i=0;i<results.size();i++) {
            boolean flag = false;
            int k = results.get(i);
            for (int j=2;j<k;j++) {
                if (k%j==0) {
                    flag = true;
                }
            }
            if (!flag) {
                answer++;
            }
        }
        

        return answer;
    }
}