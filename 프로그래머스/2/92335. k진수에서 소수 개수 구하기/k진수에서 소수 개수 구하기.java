class Solution {
    public int solution(int n, int k) {
       int answer = 0;
        String s = Integer.toString(n,k);
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        String now;
        long m;
        for (int i=0;i<len;i++) {
            char c = s.charAt(i);
            if (c!='0') {
                sb.append(c);
            } else {
                now = sb.toString();
                sb = new StringBuilder();
                if (!now.equals("")) {
                    m = Long.parseLong(now);
                    //소수인지 판별
                    if (m>2) {
                        boolean flag = true;
                        for (int j=2;j<=(int)Math.sqrt(m);j++) {
                            if (m%j==0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            answer++;
                        }
                    } else if (m==2) {
                        answer++;
                    }
                }
            }
        }
        now = sb.toString();
        if (!now.equals("")) {
            m = Long.parseLong(now);
            if (m>2) {
                boolean flag = true;
                for (int j=2;j<=(int)Math.sqrt(m);j++) {
                    if (m%j==0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            } else if (m==2) {
                answer++;
            }
        }
        return answer;
    }
}