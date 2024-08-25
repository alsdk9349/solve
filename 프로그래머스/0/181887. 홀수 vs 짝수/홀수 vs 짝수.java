class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        int sum1 = 0;
        
        for (int i=0;i<num_list.length;i++) {
            if (i%2==0) {
                sum1 += num_list[i];
            } else {
                answer += num_list[i];
            }
        }
        if (sum1>answer) {
            answer = sum1;
        }
        return answer;
    }
}