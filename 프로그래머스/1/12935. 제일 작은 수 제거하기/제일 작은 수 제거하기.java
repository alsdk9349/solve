class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if (len==1) {
            return new int[]{-1};
        }
        int[] answer = new int[len-1];
        int min = (int)21e8;
        for (int i=0;i<len;i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        for (int i=0,j=0; i<len;i++) {
            if(arr[i]!=min) {
                answer[j]=arr[i];
                j++;
            }
        }
        return answer;
    }
}