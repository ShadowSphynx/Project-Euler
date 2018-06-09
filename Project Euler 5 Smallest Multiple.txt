import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int ar[] = {1,2,3,2,5,1,7,2,3,1,11,1,13,1,1,2,17,1,19,1,1,1,23,1,5,1,3,1,29,1,31,2,1,1,1,1,37,1,1,1};
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int num = 0, solution = 1;
        while(cases!=0) {
            num = scan.nextInt();
            solution = 1;
            for(int i=0; i<num;i++)
                solution*=ar[i];
            System.out.println(solution);
            cases--;
        }
    }
}