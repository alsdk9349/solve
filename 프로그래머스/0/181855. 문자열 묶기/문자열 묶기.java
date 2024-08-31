class Solution {
    public int solution(String[] strArr) {
        int len = strArr.length;
        int [] bucket = new int[31];
        int answer = 0;
        for (int i=0;i<len;i++) {
            int s = strArr[i].length(); 
            bucket[s]++;
            if (bucket[s]>answer) {
                answer = bucket[s];
            }
        }
        return answer;
    }
}