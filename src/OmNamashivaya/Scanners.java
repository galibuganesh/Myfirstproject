package OmNamashivaya;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The entered Value is");
		System.out.print(user_input_number);
		
	}
}