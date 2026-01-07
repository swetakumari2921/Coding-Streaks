package my.collection.linkedlist.practice;

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter likedlist size: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Size should be greater than 0");
			sc.close();
			return;
		}

		for (int i = 0; i < size; i++) {
			System.out.println("Enter name " + (i + 1) + ": ");
			String name = sc.next();
			names.addLast(name);
		}

		System.out.println("First attendee: " + names.getFirst());
		System.out.println("Last attendee: " + names.getLast());

		System.out.println("Total number of attendee: " + names.size());

		for (int i = 0; i < size; i++) {
			System.out.println(names.get(i));
		}
	}
}
