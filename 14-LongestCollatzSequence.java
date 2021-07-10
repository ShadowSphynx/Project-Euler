import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		int array[] = new int[5000000];
		long j = 0;
		int count = 0, max = 0, index = 0;
		
		array[0] = 0;
		for(int i=2; i<=array.length; i++) {
		
			j = i;
			count  = 0;
			while(j != 1) {
				if(j %2 == 0 && count <= 1000)
					j /= 2;
				else
					j = (3*j) + 1;
				count++;
			}
			if(count >= max) {
				max = count;
				index = i;
			}
			array[i-1] = index;
		}
		
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int t = scanner.nextInt();
		
		for(int i = 0; i <= t; i++)
			System.out.println(array[(scanner.nextInt()) - 1]);
		
		scanner.close();
	}
}