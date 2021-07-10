import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long sumA[] = new long[1000000];
        int i =0;
        long temp = 0;
        sumA[1] = 1;
        for(i=2; i<sumA.length; i++) {
            if(isPrime(i))
                temp += i;
            sumA[i] = temp;   
        }
        
        while(t!=0) {
            System.out.println(sumA[scan.nextInt()]);
            t--;
        }
    }

    public static boolean isPrime(int n) {
        if (n<2) return false;
        if (n==2) return true;
        if (n%2==0) return false;
        for (int i = 3; i<=Math.sqrt(n);i+=2) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}