import java.util.*;
public class Solution {
    
    private static Scanner scan;
    
    public static void main(String[] args) {
    	int largest = 1, cases = 0, num=0;
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	al.add(2);
        scan = new Scanner(System.in);
        cases = scan.nextInt();
        while(cases!=0) {
        	num = scan.nextInt();
        	if(num<=largest)
        		System.out.println(al.get(num-1));
        	else {
        		for(int i=largest; i<num; i++) 
        			al.add(findNextPrime((int) al.get(i-1)));
        		System.out.println(al.get(num-1));
        		largest = num;
        	}
        	cases--;
        }
    }
    
    static int findNextPrime(int a) {
    	while(!isPrime(++a))
    		continue;
    	return a;
    }
    
    static boolean isPrime(int num) {
    	if ( num > 2 && num%2 == 0 )
    		return false;
    	int top = (int)Math.sqrt(num) + 1;
    	for(int i = 3; i < top; i+=2)
    		if(num % i == 0)
    			return false;
    	return true;
    }
}