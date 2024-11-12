class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb1 = new StringBuilder();
        for (int i=1;i<food.length;i++) {
            for (int j=0;j<food[i]/2;j++) {
                sb1.append(i);
            }
        }
        answer+=sb1.toString();
        answer+="0";
        answer+=sb1.reverse();
        return answer;
    }
}