package my.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13 {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<>();
		sports.add("Cricket");
		sports.add("Hockey");
		sports.add("Badminton");

		System.out.println("Before sorting: ");
		System.out.println(sports);

		System.out.println();

		System.out.println("After sorting: ");
		Collections.sort(sports);
		System.out.println(sports); //for string lexicographically sorting
	}
}
