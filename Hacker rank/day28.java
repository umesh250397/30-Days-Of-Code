import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N < 2 || N > 30){
            System.exit(0);
        }
        String[] f = new String[N];
        String[] e = new String[N];
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(firstName.length() <= 20 && emailID.length() <= 50){
                f[a0] = firstName;
                e[a0] = emailID;
            }
        }
        for(int i = 0; i < N; i++){
            if(f[i] != ""){
                Matcher m1 = Pattern.compile("\\p{Lower}+").matcher(f[i]);
                Matcher m2 = Pattern.compile("\\p{Lower}+(\\.)?+\\p{Lower}+[\\@gmail\\.com]+").matcher(e[i]);
                if(!m1.matches() || !m2.matches()){
                    f[i] = "";
                    e[i] = "";
                }
            }
        }
        for(int i = 0; i < N; i++){
            Arrays.sort(f);
            if(f[i] != "")
                System.out.println(f[i]);
        }
    }
}