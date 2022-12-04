package pattern;

import java.util.Scanner;

public class char_pattern_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int  n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//char startingChar =(char)('A'+i-1);
			for(int j=1; j<=i; j++) {
				System.out.print((char)64);
			}
			System.out.println();
		}

	}

}
