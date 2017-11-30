import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day9 {

    static int factorial(int n) {
        // Complete this function
        int fact=n;
        if(n>1){
           fact *= factorial(n-1);
        }
        else{
            fact *= 1;
        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
