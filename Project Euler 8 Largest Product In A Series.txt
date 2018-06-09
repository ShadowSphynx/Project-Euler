import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = 0, k = 0, i = 0, num = 1;
        int array[] = new int[1000];
        int factors[] = new int[10];
        int temp[] = new int[10];
        
        while(t!=0) {
            n = in.nextInt();
            k = in.nextInt();
            
            array = setZero(array);
            factors = setZero(factors);
            temp = setZero(temp);
            num = 1;
            
            array = getArray(in.next(), n);
            
            for(i=0; i<=(n-k); i++) {
        		if(!checkZero(array, i, i+k)) {
        			temp = getFactors(array, i, i+k);
        			if(getNum(factors, temp) < 1)
        				factors = temp;
        		}
            }

        	for(i=2; i<10; i++)
        		num *= Math.pow(i, factors[i]);if(num == 1);
        	
        	if(num == 1)
            	System.out.println(0);
            else
            	System.out.println(num);
            t--;
        }
        in.close();
    }
    
    static int[] setZero(int ar[]) {
        for(int i=0; i<ar.length; i++)
            ar[i] = 0;
        return ar;
    }
    
    static boolean checkZero(int ar[], int a, int b) {
    	for(int i=a; i<b; i++)
    		if(ar[i] == 0)
    			return true;
    	return false;
    }
    
    static int[] getFactors(int ar[], int a, int b) {
    	
    	int temp[] = new int[10];
    	for(int i=a; i<b; i++)
    		temp[ar[i]]++;
    	return temp;
    }
    
    static double getNum(int a[], int b[]) {
    	
    	double num=1;
    	for(int i=2; i<10; i++)
    		num *= Math.pow(i, (a[i]-b[i]));
    	return num;
    }
    
    static int[] getArray(String s, int n) {
    	int a[] = new int[n];
    	for(int i=0; i<n; i++) 
    		a[i] = s.charAt(i) -48;
    	return a;
    }
}