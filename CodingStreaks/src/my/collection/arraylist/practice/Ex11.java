package my.collection.arraylist.practice;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Read number of colors
		System.out.print("Enter number of colors: ");
		int n = sc.nextInt();

		// Constraint check
		if (n < 1 || n > 100) {
			System.out.println("Number of colors must be between 1 and 100.");
			sc.close();
			return;
		}

		sc.nextLine(); // Consume newline

		// Step 2: Read color names
		System.out.println("Enter " + n + " color names (space-separated):");
		String line = sc.nextLine();
		String[] colors = line.split(" ");

		if (colors.length != n) {
			System.out.println("Number of colors entered does not match " + n);
			sc.close();
			return;
		}

		// Step 3: Add colors to ArrayList<String>
		ArrayList<String> colorList = new ArrayList<>();

		for (String color : colors) {
			colorList.add(color);
		}

		// Step 4: Print list before swapping
		System.out.println("\nArray list before Swap:");
		for (String color : colorList) {
			System.out.println(color);
		}

		// Step 5: Swap first and third elements if possible
		if (n >= 3) {
			String temp = colorList.get(0);
			colorList.set(0, colorList.get(2));
			colorList.set(2, temp);

			// Step 6: Print list after swapping
			System.out.println("\nArray list after Swap:");
			for (String color : colorList) {
				System.out.println(color);
			}
		} else {
			System.out.println("\nSwap cannot be performed. The list has fewer than 3 elements.");
		}

		sc.close();
	}
}
