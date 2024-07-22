import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String [] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        for (int i=0;i<8;i++) {
            int index = st.indexOf(arr[i]);
            while (index!=-1) {
                st = st.substring(0,index) +" "+ st.substring(index+arr[i].length());
                ++cnt;
                index = st.indexOf(arr[i]);
            }
        }
        st = st.replaceAll(" ","");
        cnt+=st.length();
        System.out.println(cnt);
    }
}