package pattern;

import java.util.Scanner;

public class hill_traingle_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		
		for (int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1,p=i; j<=i; j++) {
				System.out.print(p++);
			}
			for( int j =1,p=2*i-2; j<=i-1; j++,p--) {
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
