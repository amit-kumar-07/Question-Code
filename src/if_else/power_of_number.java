package if_else;

import java.util.Scanner;

public class power_of_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int answer = (int) Math.pow(x,n);
	    System.out.println(answer);

	}

}
