package if_else;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int sum = a+b;
		System.out.println(sum);
		
		int subtraction = a-b;
		System.out.println(subtraction);
		
		int multiplication = a*b;
		System.out.println(multiplication);
		
		int division = a/b;
		System.out.println(division);
		
		int remainder = a%b;
		System.out.println(remainder);
				

	}

}
