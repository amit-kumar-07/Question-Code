package operators;

import java.util.Scanner;

public class term_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int term = 1;
		for(int i = 1; term<=n; i++) {
			int a = 3*i+2;
			if(a % 4 == 0) {
				continue;
			}
			System.out.println(a);
			term++;
			
		}

	}

}
