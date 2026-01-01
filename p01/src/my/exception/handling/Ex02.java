package my.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a;
		int result = 100;
		try {
			a = sc.nextInt();
			result = result / a;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input!");
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
