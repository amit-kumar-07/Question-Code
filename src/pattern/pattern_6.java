package pattern;

import java.util.Scanner;


public class pattern_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=n; i++) {
			int p=1;
			for(int j =1 ;j<=i; j++) {
				System.out.print("");
			}
			for(int j =i; j<=n;j++) {
				System.out.print(p++);
			}
			System.out.println();
		}

	}

}
