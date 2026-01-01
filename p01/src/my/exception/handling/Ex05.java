package my.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter numerator: ");
			int numerator = sc.nextInt();
			try {
				System.out.print("Enter denominator: ");
				int denominator = sc.nextInt();
				int result = numerator / denominator; 
				System.out.println("Result: " + result);
			} catch (ArithmeticException | InputMismatchException e) {
				System.out.println("Inner catch: Invalid denominator Entered!");
			} 
		} catch (InputMismatchException e) {
			System.out.println("Outer catch: Invalid numerator Entered!");
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
