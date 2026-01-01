package my.exception.handling;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Div is: " + c);
		} catch (Exception ex) {
			System.out.println("Exception occurred: " + ex.toString()); // Exception occurred:
																		// java.lang.ArithmeticException: / by zero
			System.out.println("Exception occurred: " + ex); // Exception occurred: java.lang.ArithmeticException: / by
																// zero
// Same output because when we print the reference of exception class then java automatically calls toString() method, 
			// because Exception classes override toString() method to show a meaningful
			// message.
			// but if we print normal class object reference not exception class then we get
			// Hashcode of the object because Normal classes (like Ex07) don’t override
			// toString(), so Normal classes inherit the default Object.toString() which
			// prints the hashcode, which is comes in hexadecimal and it change each run
			// but if you have small program then it might be constant because repeatation
			// of hascode and all is depends on JVM’s memory management.
			// for example:
			Ex07 obj = new Ex07();
			System.out.println(obj); // Output: my.exception.handling.Ex07@723279cf
// we are getting our package name with class name and some hashcode
		}
		System.out.println("Program continues...");
		sc.close();
	}
}
