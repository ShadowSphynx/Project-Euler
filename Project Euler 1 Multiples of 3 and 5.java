import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i=0;
        long n1=0,n2=0,n3=0;
		long ar[] = new long[t];
		
		for(i=0;i<t;i++)
			ar[i] = scan.nextLong();
		
		for(i=0;i<t;i++) {
			n1=(ar[i]-1)/3;
			n2=(ar[i]-1)/5;
			n3=(ar[i]-1)/15;
			n1=(3*n1*(n1+1));
			n2=(5*n2*(n2+1));
			n3=(15*n3*(n3+1));
			System.out.println((n1+n2-n3)/2);
		}
		scan.close();
    }
}