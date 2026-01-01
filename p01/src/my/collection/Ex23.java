package my.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex23 {
	public static void main(String[] args) {
		Set<String> months = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter month name: ");
			String month1 = sc.next();
			months.add(month1);
		}
		
		System.out.println(months);

	}
}
