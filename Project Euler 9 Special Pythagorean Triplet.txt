import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n=0, i=0, j=0, a=0, b=0, c=0;
		int array[] = new int[3001];
        
        for(i=1; i<3000; i++)
            for(j=(i+1); j<3000; j++) {
                a = 0;
                b = 0;
                c = ((i*i) + (j*j));
                if(isSquare(c)) {
                    a = (int)Math.sqrt(c) + i + j;
                    b = (int)Math.sqrt(c) * i * j;
					if((a<3001) && array[a] < b)
                        array[a] = b;
                }
            }

		while(t!=0) {
			n = scan.nextInt();
			if(array[n] == 0)
				System.out.println(-1);
			else
				System.out.println(array[n]);
			t--;
		}
		scan.close();
	}
	
	static boolean isSquare(double t) {
		int a = (int)Math.sqrt(t);
		if(a*a == t)
			return true;
		else
			return false;
	}
}