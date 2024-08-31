class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        
        String[] answer = myStr.trim().split("\\s+");
        if (answer.length==0 || (answer.length==1 && answer[0].isEmpty())) {
            answer = new String[]{"EMPTY"};
        }
        return answer;
    }
}