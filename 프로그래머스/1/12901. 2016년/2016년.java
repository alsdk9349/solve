class Solution {
    public String solution(int a, int b) {
        int [] minus = {3,1,3,2,3,2,3,3,2,3,2,3};
        for (int i=0;i<a-1;i++) {
            b+=minus[i];
        }
        
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        return day[b%7];
    }
}