package coding_ninja_test;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			for(int j= 1,p=n; j<=n; j++,p--) {
				if(p == i) {
					
					System.out.print("*");
					continue;
				}
				
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
