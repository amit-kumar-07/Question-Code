package operators;

import java.util.Scanner;

public class all_prime_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 2; i<=n; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
			//System.out.println();
		}

	}

}
