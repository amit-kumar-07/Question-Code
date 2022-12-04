package operators;

import java.util.Scanner;

import if_else.infinite;

public class sum_or_product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int c = s.nextInt();
		
		if (c==1) {
			int sum = 0;
			for (int i = 1; i<=n ; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
		else if (c==2) {
			int a = 1;
			for(int i = 1; i<=n; i++) {
				a = a *i;	
			}
			  System.out.println(a);
		}
		else {
			System.out.println(-1);
		}
		
		
	}

}
