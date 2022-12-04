package pattern;

import java.util.Scanner;

public class odd_alternate {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 int n = s.nextInt();
	       
	        for (int i = 1; i <= n; i++) {
	            int p = 2 * i - 1;
	            for (int j = 1; j <= n; j++) {
	                    System.out.print(p);
	                    
	                    p = p + 2;
	                    
	                 int maxOdd =(2*n)-1;
	                 if(p>maxOdd){
	                    p=1;
	                }
	               
	            }
	        System.out.println();
	        }

	}

}
