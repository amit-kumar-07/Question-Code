package operators;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int rem,d=0,base=1;
		while(n>0) {
			rem = n%10;
			d = d + rem*base;
			n = n/10;
			base = base *2;
		}
		System.out.println(d);
//		
//		Scanner s=new Scanner(System.in);
//        
//        System.out.println("Enter a binary number:");
//
//        String n=s.nextLine();
//        
//        System.out.println(Integer.parseInt(n,2));

	}

}
