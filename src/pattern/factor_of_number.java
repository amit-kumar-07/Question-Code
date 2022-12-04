package pattern;

import java.util.Scanner;

public class factor_of_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter any number : ");
		n = s.nextInt();
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}

	}

}
