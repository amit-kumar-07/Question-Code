package pattern;

import java.util.Scanner;

public class pattern_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j=1;j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1,p=1;j<=i; j++,p++) {
				System.out.print(p);
			}
			System.out.println();
		}
	}

}
