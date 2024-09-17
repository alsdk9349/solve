class Solution {
    public long solution(String numbers) {
        long len = numbers.length();
        int ind = 0;
        StringBuilder sb = new StringBuilder();
        while (ind<len) {
            char a = numbers.charAt(ind);
            char b = numbers.charAt(ind+1);
            if (a=='z') {
                sb.append('0');
                ind+=4;
            } else if (a=='o') {
                sb.append('1');
                ind+=3;
            } else if (a=='t') {
                if (b=='w') {
                    sb.append('2');
                    ind+=3;
                } else {
                    sb.append('3');
                    ind+=5;
                }
            } else if (a=='f') {
                if (b=='o') {
                    sb.append('4');
                    ind+=4;
                } else {
                    sb.append('5');
                    ind+=4;
                }
            } else if (a=='s') {
                if (b=='i') {
                    sb.append('6');
                    ind+=3;
                } else {
                    sb.append('7');
                    ind+=5;
                }
            } else if (a=='e') {
                sb.append('8');
                ind+=5;
            } else {
                sb.append('9');
                ind+=4;
            }
        }
        String s = sb.toString();
        long answer = Long.parseLong(s);
        return answer;
    }
}