class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        board[0]/=2;
        board[1]/=2;
        for (int i=0;i<keyinput.length;i++) {
            String s = keyinput[i];
            if (s.equals("left") && answer[0]-1>=-board[0]) {
                answer[0]-=1;
            } else if (s.equals("right") && answer[0]+1<=board[0]) {
                answer[0]+=1;
            } else if (s.equals("up") && answer[1]+1<=board[1]) {
                answer[1]+=1;
            } else if (s.equals("down") && answer[1]-1>=-board[1]) {
                answer[1]-=1;
            } 
        }
        return answer;
    }
}