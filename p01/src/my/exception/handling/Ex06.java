package my.exception.handling;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Dive is: " + c);
		} catch (Exception ex) {
			System.out.println("Exception occurred: " + ex.getMessage()); // Exception occurred: / by zero
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
