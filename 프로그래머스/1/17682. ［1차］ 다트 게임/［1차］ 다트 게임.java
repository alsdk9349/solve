class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int b = 0;
        int n = 0;
        int cal = 0;
        int bc = 0;
        for (int i=0;i<dartResult.length();i++) {
            char c = dartResult.charAt(i);
            int num =  c - '0';
            if (num<=9 && 1<=num) {
                b = n;
                n = num;
            } else if (num==0) {
                if (i==0) {
                    n=0;
                } else if (dartResult.charAt(i-1)-'0'<0 || dartResult.charAt(i-1)-'0'>9 ) {
                    b = n;
                    n = num;
                } else {
                    n = 10;
                }
            } else {
                if (c=='S') {
                    bc = cal;
                    cal=n;
                answer+=cal;
                } else if (c=='D') {
                    bc = cal;
                    cal=n*n;
                answer+=cal;
                } else if (c=='T') {
                    bc = cal;
                    cal=n*n*n;
                answer+=cal;
                } else if (c=='*') {
                    answer-=(cal+bc);
                    bc = 2*bc;
                    cal = 2*cal;
                    answer+=cal+bc;
                } else {
                    answer-=cal;
                    bc = cal;
                    cal=-cal;
                answer+=cal;
                }
            }
            
            System.out.println(bc+"bc"+cal+"cal"+answer);
        }
        return answer;
    }
}