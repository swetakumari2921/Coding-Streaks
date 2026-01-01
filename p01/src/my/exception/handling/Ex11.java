package my.exception.handling;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Div is: " + c);
		} catch (Exception ex) {
			// ex.printStackTrace(); // java.lang.ArithmeticException: / by zero
			// Program continues...
			// at my.exception.handling.Ex11.main(Ex11.java:12)
			// Did you notice The program continues... is coming inside the error message
			// Solution: Use System.out inside printStackTrace() as an argument/parameter
			// like this:
			ex.printStackTrace(System.out); // Now you get: java.lang.ArithmeticException: / by zero
			// at my.exception.handling.Ex11.main(Ex11.java:12)
			// Program continues...
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
