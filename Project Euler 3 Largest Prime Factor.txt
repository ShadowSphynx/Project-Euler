import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        long num = 0;
        while(cases!=0) {
            System.out.println(primeFactor(scan.nextLong()));
            cases--;
        }
    }

    public static long primeFactor(long num) {
        while ( num%2 == 0 )
            num/=2;
        if(num==1)
            return 2;
        else {
            int temp = 0;
            int top = (int)Math.sqrt(num) + 1;
            int i = 3;
            while(i < top) {
                if(num % i == 0) {
                    temp = i;
                    num/=i;
                }
                else
                    i+=2;
            }
            if( num>2)
                return num;
            else
                return temp;
        }
    }
}