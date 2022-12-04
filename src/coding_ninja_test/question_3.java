package coding_ninja_test;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
         int a = s.nextInt();
		
		int originalNumber, remainder, result = 0, n = 0;

        originalNumber = a;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = a;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == a)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
