package OmNamashivaya;

import java.util.Scanner;

public class ScannerDecimal {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Some decimal");
	double user_input_decimal = scan.nextDouble();
	

	System.out.println("The entered Value is");
	System.out.print(user_input_decimal);

}
}