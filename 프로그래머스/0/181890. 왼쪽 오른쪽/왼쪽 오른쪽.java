import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String flag = "n";
        int num = 0;
        for (int i=0;i<str_list.length;i++) {
            if (str_list[i].equals("l")) {
                flag = "l";
                num = i;
                break;
            } else if (str_list[i].equals("r")) {
                flag = "r";
                num = i;
                break;
            }
        }
        if (flag.equals("l") && num>0) {
            answer = Arrays.copyOfRange(str_list,0,num);
        } else if (flag.equals("r") && num<str_list.length-1) {
            answer = Arrays.copyOfRange(str_list,num+1,str_list.length);
        } else {
            answer = new String[0];
        }
        return answer;
    }
}