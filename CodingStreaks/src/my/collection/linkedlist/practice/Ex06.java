package my.collection.linkedlist.practice;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Read number of elements
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		if (n < 1 || n > 100) {
			System.out.println("Number of elements must be between 1 and 100.");
			sc.close();
			return;
		}

		// Step 2: Read n integers
		System.out.println("Enter " + n + " integers (space-separated):");
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		// Step 3: Read element to append
		System.out.print("Enter element to append: ");
		int newElement = sc.nextInt();

		// Step 4: Append element to the end
		list.addLast(newElement); // same as list.add(newElement)

		// Step 5: Print updated LinkedList
		System.out.print("\nUpdated LinkedList: ");
		for (int num : list) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
