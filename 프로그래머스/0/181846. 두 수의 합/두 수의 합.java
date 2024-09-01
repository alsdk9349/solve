import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger num = new BigInteger(a);
        num = num.add(new BigInteger(b));
        String answer =num.toString();
        return answer;
    }
}