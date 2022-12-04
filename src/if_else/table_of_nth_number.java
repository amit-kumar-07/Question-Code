package if_else;

import java.util.Scanner;

public class table_of_nth_number {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i=1; i<11; i++) {
			System.out.println(i*n);
		}

	}

}
