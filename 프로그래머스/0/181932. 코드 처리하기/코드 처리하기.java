class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for (int i=0;i<code.length();i++) {
            char now = code.charAt(i);
            if (!mode) {
                if (now!='1') {
                    if (i%2==0) {
                        answer+=now;
                    }
                } else {
                    mode = !mode;
                }
            } else {
                if (now!='1') {
                    if (i%2==1) {
                        answer+=now;
                    }
                } else {
                    mode = !mode;
                }
            }
        }
        if (answer.equals("")) {
            answer = "EMPTY";
        }
        return answer;
    }
}