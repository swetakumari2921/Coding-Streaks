package my.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
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
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: Cannot divide by zero!");
			} catch (InputMismatchException e) {
				System.out.println("Inner catch: Denominator should be an integer!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Outer catch: Nuomerator Should be integer!");
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
