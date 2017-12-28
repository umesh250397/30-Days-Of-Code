import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[][] a = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2 && sc.hasNextInt() ; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int fine = 0;
        if(a[0][2] < a[1][2]){
            fine = 0;
        }
        else if(a[0][2] == a[1][2]){
            if(a[0][1] < a[1][1]){
                fine = 0;
            }
            else if(a[0][1] == a[1][1]){
                if(a[0][0] < a[1][0]){
                    fine = 0;
                }
                else if(a[0][0] == a[1][0]){
                    fine = 0;
                }
                else{
                    fine = 15 * (a[0][0] - a[1][0]);
                }
            }
            else{
                fine = 500 * (a[0][1] - a[1][1]);
            }
        }
        else{
            fine = 10000;
        }
        System.out.println(fine);
    }
}