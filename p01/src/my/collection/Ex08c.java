package my.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08c {
	public static void main(String[] args) {
		List<String> movies = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter movie name: ");
			String str = sc.nextLine();
			movies.add(str);
		}
		System.out.println(movies);
		System.out.println("===================================");
		System.out.println("Enter the movie name to be searched: ");
		String input = sc.nextLine();
		boolean found = movies.contains(input);
		if (found == false) {
			System.out.println("Record not found!");
			return;
		}
		System.out.println(input + " is present on the index: " + (movies.indexOf(input)+1));
	}
}
