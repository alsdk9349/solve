import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        int len = attacks.length;
        int attackindex = 0;
        int attack = attacks[attackindex][0];
        int cnt = 0;

        for (int i=1;i<attacks[len-1][0]+1;i++) {
            if (i==attack) {
                answer-=attacks[attackindex][1];
                cnt=0;
                if (answer<=0) {
                    return -1;
                }
                attackindex++;
                if (attackindex<len) {
                    attack = attacks[attackindex][0];
                }
            } else {
                cnt++;
                answer+=bandage[1];
                if (cnt==bandage[0]) {
                    answer+=bandage[2];
                    cnt=0;
                }
                if (answer>health) {
                    answer = health;
                }
            }
        }
        return answer;
    }
}