import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chances = scan.nextInt();
		int num = 0;
		while(chances!=0) {
			num = scan.nextInt();
            num--;
			while(!(checkPalindrome(num) && largeFactors(num)))
				num--;
			System.out.println(num);
			chances--;
		}
	}
	
	static boolean checkPalindrome(int a) {
		int temp = a, num=0, b=0;
		while(temp!=0) {
			b=temp%10;
			num = num*10 + b;
			temp /= 10;
		}
		if(num==a)
			return true;
		else
			return false;
	}
	
	static boolean largeFactors(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=100; i<=999; i++)
			if(num%i==0)
				al.add(i);
		if(al.size()>=2)
			for(int i=0; i<al.size(); i++)
				for(int j=0; j<al.size(); j++)
					if(al.get(i)*al.get(j)==num && i!=j)
						return true;
		return false;
	}
}