package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// First list
		System.out.println("Enter the number of colors in the first list:");
		int n1 = sc.nextInt();
		List<String> firstList = new LinkedList<>();
		System.out.println("Enter " + n1 + " colors for the first list (space-separated):");
		for (int i = 0; i < n1; i++) {
			firstList.add(sc.next());
		}

		// Second list
		System.out.println("Enter the number of colors in the second list:");
		int n2 = sc.nextInt();
		List<String> secondList = new LinkedList<>();
		System.out.println("Enter " + n2 + " colors for the second list (space-separated):");
		for (int i = 0; i < n2; i++) {
			secondList.add(sc.next());
		}

		// Merge both lists into a new list
		List<String> mergedList = new LinkedList<>();
		mergedList.addAll(firstList);
		mergedList.addAll(secondList);

		// Print all three lists
		System.out.print("List of first array: ");
		for (String color : firstList) {
			System.out.print(color + " ");
		}
		System.out.println();

		System.out.print("List of second array: ");
		for (String color : secondList) {
			System.out.print(color + " ");
		}
		System.out.println();

		System.out.print("New array: ");
		for (String color : mergedList) {
			System.out.print(color + " ");
		}

		sc.close();
	}
}
