package if_else;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        int evenSum = 0;
	        int oddSum = 0;
	        
	        while (n > 0){
	            
	            int num = n % 10;
	            
	            if (num % 2 == 0){
	                evenSum = evenSum + num;
	            }else{
	                oddSum = oddSum + num;
	            }
	            
	            n = n / 10;
	        }
	        
			System.out.println(evenSum + " " + oddSum);
	            
	}

}
