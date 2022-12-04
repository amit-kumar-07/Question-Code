package if_else;

import java.util.Scanner;

public class sum_ofeven_number_till_n {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for (int i=0; i<=n; i++) {
			 if( i % 2 == 0) {
			 sum = sum+i;
			 }
			
		}
         System.out.println(sum);
	}

}
