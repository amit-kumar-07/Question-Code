package pattern;

import java.util.Scanner;

public class diamond_decreasing {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		System.out.println("*");
		for(int i = 1; i<=n; i++) {
			System.out.print("*");
			for ( int j = 1,p=1; j<=i; j++,p++) {
				System.out.print(p);
			}
			for (int j = 1, p = i-1; j<=i-1; p--,j++) {
				System.out.print(p);
			}
			System.out.print("*");
			System.out.println();
		}
		
		for( int i = n-1; i>=1; i--) {
			System.out.print("*");
			for(int j=1,p=1; j<=i; j++,p++) {
				System.out.print(p);
			}
			for( int j = 1,p=i-1; j<=i-1; j++,p--) {
				System.out.print(p);
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println("*");

	}

}
