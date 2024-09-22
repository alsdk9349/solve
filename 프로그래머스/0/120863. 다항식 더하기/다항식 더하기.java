class Solution {
    public String solution(String polynomial) {
        int a=0;
        int b=0;
        String [] arr = polynomial.split(" ");
        for (int i=0;i<arr.length;i+=2) {
            String s = arr[i];
            char c=s.charAt(s.length()-1);
            if (c=='x') {
                if (s.length()>1) {
                    String mid = s.substring(0,s.length()-1);
                    a+=Integer.parseInt(mid);
                } else {
                    a+=1;
                }

            } else {
                b+=Integer.parseInt(arr[i]);
            }
        }
        if (a==0&&b==0) {
            return "0";
        } else if (a==0) {
            return String.valueOf(b);
        } else if (b==0) {
            if (a==1) {
                return "x";
            }
            return a+"x";
        } else {
            if (a==1) {
                return "x + "+b;
            }
            return a+"x + "+b;
        }
    }
}