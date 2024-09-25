import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] babbling) {
        int len = babbling.length;
        int answer = 0;
        for (int i=0;i<len;i++) {
            String now = babbling[i];
            int l = now.length();
            int k = 0;
            boolean f = true;
            while (k<l) {
                char c = now.charAt(k++);
                if (c=='a') {
                    if (k==l) {
                        f=false;
                        break;
                    }
                    c = now.charAt(k++);
                    if (c=='y') {
                        if (k==l) {
                            f=false;
                            break;
                        }
                        c = now.charAt(k++);
                        if (c!='a') {
                            f=false;
                            break;
                        }
                    } else {
                        f=false;
                        break;
                    }
                } else if (c=='y') {
                    if (k==l) {
                        f=false;
                        break;
                    }
                    c = now.charAt(k++);
                    if (c!='e') {
                        f=false;
                        break;
                    }
                } else if (c=='w') {
                    if (k==l) {
                        f=false;
                        break;
                    }
                    c = now.charAt(k++);
                    if (c=='o') {
                        if (k==l) {
                            f=false;
                            break;
                        }
                        c = now.charAt(k++);
                        if (c!='o') {
                            f=false;
                            break;
                        }
                    } else {
                        f=false;
                        break;
                    }
                } else if (c=='m') {
                    if (k==l) {
                        f=false;
                        break;
                    }
                    c = now.charAt(k++);
                    if (c!='a') {
                        f=false;
                        break;
                    }
                } else {
                    f=false;
                    break;
                }
            }
            if (f) {
                answer++;
            }
        }
        return answer;
    }
}