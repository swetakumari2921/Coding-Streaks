package my.collection.arraylist.practice;

import java.util.ArrayList;

public class Ex229 {

	public static void main(String[] args) {
		String str = "baca";

		ArrayList<String> rotations = new ArrayList<>();

		// Generate all rotations
		for (int i = 0; i < str.length(); i++) {
			String rotation = str.substring(i) + str.substring(0, i);
			rotations.add(rotation);
		}

		// Find lexicographically largest rotation
		String largest = rotations.get(0);
		for (String s : rotations) {
			if (s.compareTo(largest) > 0) {
				largest = s;
			}
		}

		System.out.println("Largest Rotation: " + largest);
	}
}
