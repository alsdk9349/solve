import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        int r = Math.min(balls-share,share);
        for (int i=0;i<r;i++) {
            answer = answer.multiply(BigInteger.valueOf(balls-i));
        }
        for (long i=0;i<r;i++) {
            answer=answer.divide(BigInteger.valueOf(r-i));
        }
        return answer.intValue();
    }
}