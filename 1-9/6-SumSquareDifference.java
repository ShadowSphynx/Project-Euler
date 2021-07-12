import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int num = 0;
        long sum = 0, sqsum = 0;
        while(cases!=0) {
            sum = 0; sqsum = 0;
            num = scan.nextInt();
            for(int i=1; i<=num;i++) {
                sqsum+= i*i;
                sum+=i;
            }
            System.out.println((sum*sum) - sqsum);
            cases--;
        }
    }
}