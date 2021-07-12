import java.io.*;
import java.util.*;

public class Solution {

    	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i=0;
        long sum=0,a=0,b=0;
		long ar[] = new long[t];
		
		for(i=0;i<t;i++)
			ar[i] = scan.nextLong();
		
		for(i=0;i<t;i++) {
			sum=0;
			if(ar[i]==0)
				System.out.println(sum);
			else {
				a=1;
				b=2;
				while(b<ar[i]) {
					if(b%2==0)
						sum+=b;
					b=a+b;
					a=b-a;
				}
				System.out.println(sum);
			}
		}
			
		scan.close();
	}
}