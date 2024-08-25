import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int cnt = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i<todo_list.length;i++) {
            if (!finished[i]) {
                result.add(todo_list[i]);
                cnt++;
            }
        }
        answer = new String[cnt];
        for (int i=0;i<cnt;i++) {
            answer[i] =result.get(i);
        }
        return answer;
    }
}