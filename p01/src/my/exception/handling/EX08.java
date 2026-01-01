package my.exception.handling;

import java.util.Scanner;

public class EX08 {
	@Override
	public String toString() {
		return "Zero is not allowed";
	}

	public static void main(String[] args) {
		EX08 obj = new EX08();

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Div is: " + c);
		} catch (Exception ex) {
			System.out.println("Exception occurred: " + obj.toString());
		}
		System.out.println("Program continues...");
		sc.close();
		// Your code “makes sense” in terms of output, but it’s not proper exception handling.
		// Using EX08.toString() to print the message works, but a better approach is
		// either custom exception or directly printing the friendly message in the
		// catch block.
	}
}
