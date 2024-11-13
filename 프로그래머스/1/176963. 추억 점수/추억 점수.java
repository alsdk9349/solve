class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len = photo.length;
        int com = name.length;
        int[] answer = new int[len];
        for (int i=0;i<len;i++) {
            for (int j=0;j<com;j++) {
                boolean flag = false;
                for (int k=0;k<photo[i].length;k++) {
                    if (name[j].equals(photo[i][k])) {
                        flag = true;
                        answer[i]+=yearning[j];
                        break;
                    }
                }

            }
        }
        return answer;
    }
}