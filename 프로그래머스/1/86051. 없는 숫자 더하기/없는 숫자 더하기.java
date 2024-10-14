class Solution {
    public int solution(int[] numbers) {
        boolean [] visit = new boolean[10];
        for (int i=0;i<numbers.length;i++) {
            visit[numbers[i]] = true;
        }
        int answer = 0;
        for (int i=0;i<10;i++) {
            if (!visit[i]) {
                answer+=i;
            }
        }
        return answer;
    }
}