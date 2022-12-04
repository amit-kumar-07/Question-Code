package pattern;

import java.util.Scanner;

public class diamond_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int  i = 1; i<=n; i++) {
			for (int j = 1,p=1; j<=2*i-1; j++,p++) {
				System.out.print(p);
			}
			System.out.println();
		}
		for(int  i = n-1; i>=1; i--) {
			for  (int j= 1,p=1; j<=2*i-1; j++,p++) {
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
