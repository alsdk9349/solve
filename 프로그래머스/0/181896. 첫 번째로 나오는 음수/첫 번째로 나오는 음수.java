class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean flag = false;
        for (int i=0;i<num_list.length;i++) {
            if (num_list[i]<0) {
                answer = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            answer = -1;
        }
        return answer;
    }
}