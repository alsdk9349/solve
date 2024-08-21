class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String jak = "";
        for (int i=0;i<num_list.length;i++) {
            int now = num_list[i];
            if (now%2==0) {
                jak+=Integer.toString(now);
            } else {
                hol+=Integer.toString(now);
            }
        }
        answer+=Integer.parseInt(hol);
        answer+=Integer.parseInt(jak);
        return answer;
    }
}