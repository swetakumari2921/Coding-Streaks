package my.exception.handling;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = kb.nextInt();
			int b = kb.nextInt();
			if (a <= 0) {
				ArithmeticException ex = new ArithmeticException("Numerator must be positive");
				throw ex;
			}
			else if (b <= 0) {
				ArithmeticException ex = new ArithmeticException("Denominator must be positive");
				throw ex;
			}
			// this is correct but not good practice put this block inside else block
//			int c = a / b;
//			System.out.println("Div is: " + c);

			// when both if condition will false means when the value of a and b is positive
			// then only the else block will get execute
			else {
				int c = a / b;
				System.out.println("Div is: " + c);
			}

		} catch (ArithmeticException ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		}
	}
}
