package my.strings.practice;

import java.util.Scanner;

// 11. Copy one string to another

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.nextLine();

		System.out.println("Old String: " + str);
		String str2 = new String(str);

		System.out.println("New String: " + str2);

		sc.close();
	}
}
