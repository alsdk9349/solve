class Solution {
    public int solution(int[] numbers) {
        int m = (int)-21e8;
        
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                if (numbers[i]*numbers[j]>m) {
                    m=numbers[i]*numbers[j];
                }
            }
        }
        return m;
    }
}