class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<s.length()) {
            char c = s.charAt(i);
            int now = c - '0';
            if (0<=now && now <=9) {
                sb.append(c);
                i++;
            } else {
                if (c=='z') {
                    sb.append('0');
                    i+=4;
                } else if (c=='o') {
                    sb.append('1');
                    i+=3;
                } else if (c=='t') {
                    if (s.charAt(i+1)=='w') {
                        sb.append('2');
                        i+=3;
                    } else {
                        sb.append('3');
                        i+=5;
                    }
                } else if (c=='f') {
                    if (s.charAt(i+1)=='o') {
                        sb.append('4');
                        i+=4;
                    } else {
                        sb.append('5');
                        i+=4;
                    }
                } else if (c=='s') {
                    if (s.charAt(i+1)=='i') {
                        sb.append('6');
                        i+=3;
                    } else {
                        sb.append('7');
                        i+=5;
                    }
                } else if (c=='e') {
                    sb.append('8');
                    i+=5;
                } else {
                    sb.append('9');
                    i+=4;
                }
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }
}