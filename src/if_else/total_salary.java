package if_else;

import java.util.Scanner;

public class total_salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic,allow;
		double hra,da,pf;
		
		System.out.println("Enter the basic salary and grade");
		basic = s.nextInt();
		char grade = s.next().charAt(0);
		hra = 0.2*basic;
		da = 0.5*basic;
		pf = 0.11*basic;
		
		if ( grade == 'A') {
			allow =1700;
		}
		else if ( grade == 'B') {
			allow =1500;
		}
		else {
			allow =1300;
		}
		double totalSalary;
		totalSalary = basic+hra+da+allow-pf;
		System.out.println(Math.round(totalSalary));


	}

}
