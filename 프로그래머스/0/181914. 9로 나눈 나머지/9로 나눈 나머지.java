import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        BigInteger result = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        result = result.remainder(nine);
        answer = result.intValue();
        return answer;
    }
}