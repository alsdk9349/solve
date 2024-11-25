class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i=0;i<babbling.length;i++) {
            String now = babbling[i];
            now = now.replaceAll("aya","1");
            now = now.replaceAll("ye","2");
            now = now.replaceAll("woo","3");
            now = now.replaceAll("ma","4");
            
            boolean flag = false;
            int num = now.charAt(0) -'0';
            for (int j=1;j<now.length();j++) {
                if (num>4) {
                    flag = true;
                    break;
                }
                int check = now.charAt(j)-'0';
                if (num==check) {
                    flag = true;
                    break;
                } else {
                    num = check;
                }
            }
            if (num>4) {
                flag = true;
            }
            if (!flag) {
                answer++;
            }
        }
        return answer;
    }
}