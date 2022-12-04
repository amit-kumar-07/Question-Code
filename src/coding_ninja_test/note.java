package lecture4_Arraybasic_array;

public class linear_search {

	public static int linearSearch (int input[], int value, int n) {
		
		for(int i =0;i<input.length;i++) {
			if(input[i] == value) {
				return i;
			}
		}
		return -1;

	}

}

//package lecture4_Arraybasic_array;
//
//import java.util.Scanner;
//
//public class array_input {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter size : ");
//		
//		int size = s.nextInt();
//		int numbers[] = new int[size];
//		
//		for(int i =0;i<size;i++) {
//			numbers[i] = s.nextInt();
//		}
//		for(int i =0;i<size;i++) {
//			System.out.println(numbers[i]);
//		}
//
//	}
//
//}

