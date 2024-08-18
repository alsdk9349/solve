import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        int rest = 1000 - pay;
        int result = 0;
        if (rest >=500) {
            result+= rest/500;
            rest = rest%500;
        }
        if (rest >=100) {
            result+= rest/100;
            rest = rest%100;
        }
        if (rest >=50) {
            result+= rest/50;
            rest = rest%50;
        }
        if (rest >=10) {
            result+= rest/10;
            rest = rest%10;
        }
        if (rest >=5) {
            result+= rest/5;
            rest = rest%5;
        }
        result+= rest;
        System.out.println(result);
    }
}