package operators;

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		double a = Math.pow(n, 0.5);
		
		System.out.println((int)a);
		// or 
	
       // or
		//double a = Math.sqrt(n);
	}

}
