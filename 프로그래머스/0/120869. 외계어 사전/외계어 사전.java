class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int sl = spell.length;
        int l = dic.length;
        int answer = 2;

        boolean [] v;
        for (int i=0;i<l;i++) {
            v = new boolean[sl];
            String s = dic[i];
            for (int j=0;j<s.length();j++) {
                String now = String.valueOf(s.charAt(j));
                for (int k=0;k<sl;k++) {
                    if (spell[k].equals(now)) {
                        v[k]=true;
                        break;
                    }
                }
            }
            boolean f = true;
            for (int j=0;j<sl;j++) {
                if (v[j]==false) {
                    f=false;
                    break;
                }
            }
            if (f) {
                answer=1;
                break;
            }
        }
        return answer;
    }
}