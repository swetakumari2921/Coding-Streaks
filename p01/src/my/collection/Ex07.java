package my.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Using Enhanced For Loop
public class Ex07 {

	public static void main(String[] args) {
		List<String> months = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter month name: ");
			String str = sc.nextLine();
			months.add(str);
		}

		// not reverse order by using enhanced for we cannot print in reverse order but
		// by using some trick we can
		System.out.println("Natural order");
		for (String str : months) {
			System.out.println(str);
		}

		
		System.out.println("======================================");
		
		
		System.out.println("Reverse order");
		// trick: reverse order by using enhanced for loop
		// first reverse by using the reverse method of collections
		Collections.reverse(months);
		// second print the months
		for (String str : months) {
			System.out.println(str);
		}
	}
}
