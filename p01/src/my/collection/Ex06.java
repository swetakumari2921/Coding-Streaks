package my.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		List<String> months = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter month name: ");
			String str = sc.nextLine();
			months.add(str);
		}

		// printing them back in reverse order vertically
		for (int i = months.size() - 1; i >= 0; i--) {
			System.out.println(months.get(i));
		}
		
		// printing them in original order vertically
		for (int i = 0; i <= months.size() - 1; i++) {
			System.out.println(months.get(i));
		}

	}
}
