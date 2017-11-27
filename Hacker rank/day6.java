import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        String s[] = new String[11];
        for(int j =0; j<i ; j++){
            s[j] = sc.nextLine();
        }
        for(int j=0; j<i; j++){
           char []ch = s[j].toCharArray();
            for(int k=0; k<s[j].length(); k++){
                if(k%2 == 0){
                    System.out.print(ch[k]);
                }
                else{
                    continue;
                }
            }
            System.out.print(" ");
            for(int k=0; k<s[j].length(); k++){
                if(k%2 == 1){
                    System.out.print(ch[k]);
                }
                else{
                    continue;
                }
            }
            System.out.println();
        }
    }
}