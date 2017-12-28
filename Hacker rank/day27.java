import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day27 {


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named day27.*/
            day27(int n, int k, int[] a){
            System.out.println(n + " " + k);
            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            }

        public static void main(String[] args) {
            // number of test cases - each test case is of two lines
            int testCases = 5;

            System.out.println(testCases);
            new day27(4, 3, new int[] {-1, 0, 4, 2});
            new day27(5, 2, new int[] {0, -1, 2, 1, 4});
            new day27(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
            new day27(3, 1, new int[] {-1, 0, 4});
            new day27(6, 4, new int[] {0, -1, 1, 4, 5, 6});
        }

}