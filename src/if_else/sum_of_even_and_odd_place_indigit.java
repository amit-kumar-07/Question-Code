package if_else;

import java.util.Scanner;

public class sum_of_even_and_odd_place_indigit {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,lastdigit,evensum=0,oddsum=0;
		System.out.println("Enter any number");
		n = s.nextInt();
		while (n>0) {
			lastdigit=n%10;
			if(lastdigit%2==0) {
				evensum = evensum+lastdigit;
			
			}else {
				oddsum = oddsum+lastdigit;
			}
			n= n/10;
		}
			System.out.println(evensum + " " + oddsum);
			

   }
}
