package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex228 {

	// Function to find lexicographically smallest rotation
	public static ArrayList<Character> smallestRotation(ArrayList<Character> list) {
		int n = list.size();

		if (n == 0) {
			return new ArrayList<>();
		}

		ArrayList<Character> smallest = new ArrayList<>(list);

		for (int i = 1; i < n; i++) {
			ArrayList<Character> rotation = new ArrayList<>();

			// Add elements from i to end
			for (int j = i; j < n; j++) {
				rotation.add(list.get(j));
			}

			// Add elements from start to i-1
			for (int j = 0; j < i; j++) {
				rotation.add(list.get(j));
			}

			// Compare rotations
			if (isSmaller(rotation, smallest)) {
				smallest = rotation;
			}
		}

		return smallest;
	}

	// Compare two ArrayLists lexicographically
	private static boolean isSmaller(ArrayList<Character> a, ArrayList<Character> b) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < b.get(i)) {
				return true;
			} else if (a.get(i) > b.get(i)) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.next();

		ArrayList<Character> list = new ArrayList<>();

		for (char ch : str.toCharArray()) {
			list.add(ch);
		}

		ArrayList<Character> result = smallestRotation(list);

		System.out.print("Lexicographically Smallest Rotation: ");
		for (char ch : result) {
			System.out.print(ch);
		}

		sc.close();
	}
}
