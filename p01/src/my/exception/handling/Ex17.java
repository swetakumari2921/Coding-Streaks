package my.exception.handling;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a <= 0) {
				ArithmeticException ex = new ArithmeticException("Numerator must be positive");
				throw ex;
			} else if (b >= 0) {
				ArithmeticException ex = new ArithmeticException("Denominator must be positive");
				throw ex;
			}
			int c = a / b;
			System.out.println("Div is: " + c);
		} catch (ArithmeticException ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		} finally {
			System.out.println("Have a good day!");
		}
	}
}
