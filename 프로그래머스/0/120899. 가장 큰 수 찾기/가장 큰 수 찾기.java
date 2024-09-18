class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int m = (int) -21e8;
        int d = -1;
        for (int i = 0;i<array.length;i++) {
            if (array[i]>m) {
                m = array[i];
                d = i;
            }
        }
        answer[0] = m;
        answer [1] = d;
        return answer;
    }
}