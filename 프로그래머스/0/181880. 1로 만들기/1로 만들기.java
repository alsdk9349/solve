class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i=0;i<num_list.length;i++) {
            int k = num_list[i];
            while (k!=1) {
                answer++;
                k=k/2;
            }
        }
        return answer;
    }
}