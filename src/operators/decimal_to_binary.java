package operators;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long n = s.nextInt();
		long rem,d=0,base=1;
		
		while(n>0) {
			rem = n%2;
			d = d + rem * base;
			n = n/2;
			base = base *10;
		}
		System.out.println(d);

	}

}
