package pattern;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class mountain_shape {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 1; i<=n; i++) {
			for( int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<i; j++) {
				System.out.print("* ");
			}
			for (int j = 1;j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
