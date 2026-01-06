package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arraylist: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Size should be greater than 0");
			sc.close();
			return;
		}

		List<String> str = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			String element = sc.next();
			str.addFirst(element);
		}

		System.out.println("Queue Size: " + size);
		System.out.println("Customers: ");
		for (int i = 0; i < size; i++) {
			System.out.println(str.get(i) + " ");
		}
		sc.close();
	}
}
