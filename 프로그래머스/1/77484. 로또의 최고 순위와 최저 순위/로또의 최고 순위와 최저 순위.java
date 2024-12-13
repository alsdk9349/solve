class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int correct = 0;
        for (int i=0;i<6;i++) {
            for (int j=0;j<6;j++) {
                if (lottos[i]==0) {
                    zero++;
                    break;
                } else if (lottos[i]==win_nums[j]) {
                    correct++;
                }
            }
        }
        if (correct==6) {
            answer[1]=1;
        } else if (correct==5) {
            answer[1]=2;
        } else if (correct==4) {
            answer[1]=3;
        } else if (correct==3) {
            answer[1]=4;
        } else if (correct==2) {
            answer[1]=5;
        } else {
            answer[1]=6;
        }
        correct+=zero;
        if (correct>=6) {
            answer[0]=1;
        } else if (correct==5) {
            answer[0]=2;
        } else if (correct==4) {
            answer[0]=3;
        } else if (correct==3) {
            answer[0]=4;
        } else if (correct==2) {
            answer[0]=5;
        } else {
            answer[0]=6;
        }
        return answer;
    }
}