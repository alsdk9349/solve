class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int answer = 0;
        int [] com = new int[len];
        while (true) {
            for (int i=0;i<len;i++) {
                int k = arr[i];
                if (k>=50 && k%2==0) {
                    com[i]=k/2;
                } else if (k<50 && k%2==1) {
                    com[i]=k*2+1;
                } else {
                    com[i]=k;
                }               
            }
            boolean flag = true;
            for (int i=0;i<len;i++) {
                if (arr[i]!=com[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                break;
            } else {
                for (int i=0;i<len;i++) {
                    arr[i] = com[i];
                }
            }
        
            answer++;
        }
        return answer;
    }
}