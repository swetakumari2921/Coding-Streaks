package my.collection.arraylist.practice;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> str = new ArrayList<>();

		System.out.println("Enter size of arraylist: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.err.println("Size should be greater than 0");
			sc.close();
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.println("Enter String: ");
			str.add(sc.next());
		}

		System.out.println("Before: ");
		// normal for loop
//			for (int i = 0; i < size; i++) {
//				System.out.print(str.get(i) + " ");
//			}
		// enhanced for loop
		for (String s : str) {
			System.out.print(s + " ");
		}

		System.out.println("\nEnter index to replace with new string: ");
		int index = sc.nextInt();

		if (index >= 0 && index <= str.size()) {
			System.out.println("Enter new String: ");
			String newString = sc.next();
			str.add(index, newString);

		} else {
			System.err.print("Index not found!");
			sc.close();
			return;
		}
		System.out.println("After:");
		// normal for loop
//			for (int i = 0; i <= size; i++) {
//				System.out.print(str.get(i)+" ");
//			}

		// enhanced for loop
		for (String s : str) {
			System.out.print(s + " ");
		}
		sc.close();
	}

}
