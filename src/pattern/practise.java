package pattern;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//int n = s.nextInt();
		
		char[] c = {'A','B','C','D','E','F','G'};
	    int i,j;

	    for(j = 5; j >= 0; j--)
	    {
	        for(int k = 0; k <= j; k++)
	        {
	            System.out.print(c[k]);
	        }
	        for(i = j; i >= 0; i--)
	        {
	            System.out.print(c[i]);
	        }

	        System.out.println();
	    }

	}

}
