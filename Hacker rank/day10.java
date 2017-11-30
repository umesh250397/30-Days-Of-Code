import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day10 {

    public static int c = 1 , k = 0 ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[20] ;
        int temp = 1;
        while(n>0){
                a[k] = n%2;
                n = n/2;
                k++;
        }
        for(int i = 0; i < k ; i++){
            if(a[i] == 0){
                continue;
            }
            else{
                con(a , i);
                if(c > temp){
                    temp = c;
                }
                c=1;
            }
        }
        System.out.println(temp);
    }

    public static void con(int[] a, int i){

        if(i<k){
            if(a[i] == a[i+1]){
               c++;
               con(a , i+1);
            }
        }
    }
}
