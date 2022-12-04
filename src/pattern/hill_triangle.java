package pattern;

import java.util.Scanner;

import if_else.infinite;

public class hill_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for( int i = 1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1,p=1; j<=i; j++ ) {
				System.out.print(p++);
			}
			for(int j =1,p=i-1;j<=i-1; p--,j++) {
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
