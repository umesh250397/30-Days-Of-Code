import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day25 {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        String s = "";
        for(int i = 0; i < n; i++){
            int t = a[i];
            if(t == 1){
                System.out.println("Not prime");
            }
            else if(t == 2){
                System.out.println("Prime");
            }
            else{
                for(int j = 2; j <= t/2 ; j++){
                    if(t % j == 0){
                        s = "Not prime";
                        break;
                    }
                    else{
                        s = "Prime";
                    }
                }
                System.out.println(s);
            }
        }
    }
}