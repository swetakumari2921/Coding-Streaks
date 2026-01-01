package my.exception.handling;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // First exception: ArithmeticException
        try {
            System.out.print("Enter a number to divide 50 by: ");
            int num = sc.nextInt();
            int result = 50 / num;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // Second exception: NullPointerException
        try {
            System.out.print("Enter your name (or press enter to leave blank): ");
            sc.nextLine(); // consume leftover newline
            String name = sc.nextLine();

            if (name.isEmpty()) {
                name = null; // simulate missing input
            }
            System.out.println("Your name length is: " + name.length()); // may throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Name cannot be null!");
        }
        
        System.out.println("Program continues normally...");
        sc.close();
	}
}
