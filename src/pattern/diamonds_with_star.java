package pattern;

import java.util.Scanner;

public class diamonds_with_star {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
        int n1 = (n+1)/2;
        int n2 = (n/2)+1;
        // int i=1;
		
		for ( int i = 1; i<=n1; i++) {
			for(int j = 1; j<=n1-i; j++) {
				System.out.print(" ");
			}
			for ( int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for ( int i=n2-1; i>=1; i--) {
			for (int j = 1; j<=n2-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
