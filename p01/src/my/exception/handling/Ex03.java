package my.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	//correct but not good practice
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int a;
//		int result = 100;
//		try {
//			a = sc.nextInt();
//			result = result / a;
//			System.out.println("Result: " + result);
//		} catch (ArithmeticException | InputMismatchException e) {
//			System.out.println("Invalid input or division by zero:");
//		}
//		System.out.println("Program continues...");
//		sc.close();
//	}
	
	//correct but good practice
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			int result = 100/ a;
			System.out.println("Result: " + result);
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Invalid input or division by zero:");
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
