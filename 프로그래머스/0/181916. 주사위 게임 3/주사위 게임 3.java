import java.util.*;
import java.io.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] arr = {a,b,c,d};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        if (a==b && b==c && c==d) {
            answer = 1111 * a;
        } else if (a!=b && b!=c && c!=d && d!=a) {
            answer = a;
        } else if (a==b && c==d && a!=c) {
            answer = (a+c) * (c-a);
        } else if (a==b && b==c && c!=d) {
            answer = (10 * a + d) * (10 * a + d);
        } else if (a!=b && b==c && c==d){
            answer = (10 * d + a) * (10 * d + a);
        } else if (a==b) {
            answer = c * d;
        } else if (b==c) {
            answer = a * d;
        } else if (c==d) {
            answer = a * b;
        }
        return answer;
    }
}