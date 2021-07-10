import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		int i = 0, temp=0;
		
		for(i=1; i<410000; i++) {
			temp+=i;
			list1.add(temp);
			list2.add(getFactors(temp));
		}
		
		int t = scanner.nextInt();
		int num = 0;
		
		while(t!=0) {
			num = scanner.nextInt();
			temp = 0;
				
			for(int j : list2)
				if(num < j) {
					System.out.println(list1.get(temp));
					break;
				}
				else
					temp++;
			t--;
		}
		scanner.close();
	}
	
	static int getFactors(int num) {
		
		int fact[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97101, 103, 107, 109, 113, 127, 131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
		int count[] = new int[168];
		int i=0, answer = 1;

		while(num != 1 & i!= 167) {
			if(num%fact[i] == 0) {
				num /= fact[i];
				count[i]++;
			}
			
			else
				i++;
		}
		
		for(int k :count)
			answer *= (k+1);
		
		return answer;
	}
}