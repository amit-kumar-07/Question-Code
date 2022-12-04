package pattern;

import java.util.Scanner;

public class rhombus_with_reflection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for ( int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for ( int j = 1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for ( int i=n-1; i>=1; i--) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
