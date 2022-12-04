package pattern;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
        
		for(int i = 1,p=1; i<=n; i++) {
			for (int j=1,odd=1; j<=n; j++) {
				System.out.print(odd);
				odd = odd+2;
			}
			System.out.println();
			p=p+2;
		}
        
	}

}
