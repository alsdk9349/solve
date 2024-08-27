class Solution {
    public int solution(String myString, String pat) {
        int blen = myString.length();
        int slen = pat.length();
        int answer = 0;
        
            boolean flag = false;
        if (blen>=slen) {
            for (int i=0;i<=blen-slen;i++) {
                boolean midflag = true;
                for (int j = i; j < i + slen; j++) {
                    String a = String.valueOf(myString.charAt(j)).toLowerCase();
                    String b = String.valueOf( pat.charAt(j-i)).toLowerCase();                    
                    if (!a.equals(b)) {
                        midflag = false;
                        break;
                    }
                }
                if (midflag==true) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag==true) {
            answer = 1;
        }
        return answer;
    }
}