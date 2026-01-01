package my.collection;

import java.util.ArrayList;
import java.util.List;

public class Ex09aa {
	public static void main(String[] args) {
		List<String> movies = new ArrayList<>();
		movies.add("Jan");
		movies.add("Feb");
		movies.add("March");
		movies.add("April");

		System.out.println("Before deletion: " + movies);
		System.out.println("Is march removed? " + movies.remove(2));
		System.out.println("After deletion: " + movies);
		System.out.println("Is August removed: " + movies.remove(7));
		System.out.println("After deletion: " + movies);

	}
}
