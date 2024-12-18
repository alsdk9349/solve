import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> lst = new HashMap<>();
        for (int i=0;i<participant.length;i++) {
            if (lst.containsKey(participant[i])){
                lst.put(participant[i],lst.get(participant[i])+1);
            } else {
                lst.put(participant[i],1);
            }
        }
        for (int i=0;i<completion.length;i++) {
            if (lst.get(completion[i])==1) {
                lst.remove(completion[i]);
            } else {
                lst.put(completion[i], lst.get(completion[i])-1);
            }
        }
        
        for (String key : lst.keySet()) {
            if (lst.get(key) > 0) {
                return key;
            }
        }
        return "";
    }
}