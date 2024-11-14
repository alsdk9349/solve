class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int ind1 = 0;
        int ind2 = 0;
        int ind3 = 0;
        while (ind3<goal.length) {
            if (ind1<cards1.length && cards1[ind1].equals(goal[ind3])) {
                ind1++;
            } else if (ind2<cards2.length && cards2[ind2].equals(goal[ind3])) {
                ind2++;
            } else {
                return "No";
            }
            ind3++;
        }
        return answer;
    }
}