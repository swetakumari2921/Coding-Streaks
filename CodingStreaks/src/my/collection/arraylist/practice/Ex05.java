package my.collection.arraylist.practice;

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arraylist: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			int element = sc.nextInt();
			nums.add(element);
		}

		System.out.println("Old Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(nums.get(i) + " ");
		}

		System.out.println("\nEnter index to be removed: ");
		int index = sc.nextInt();
		if (index >= nums.size() || index < 0) {
			System.err.println("Index not found");
			sc.close();
			return;
		}

		nums.remove(index);

		System.out.println("Updated Array: ");

		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		sc.close();
	}
}
