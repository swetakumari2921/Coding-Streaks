package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of customers: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Should be greater than 0");
			sc.close();
			return;
		}

		List<String> customers = new LinkedList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter customer " + (i + 1) + ": ");
			String task = sc.next();
			customers.addLast(task);
		}

		System.out.println("Number of customers: " + customers.size());

		System.out.println("Customers: ");
		for (String customer : customers) {
			System.out.println(customer);
		}
		sc.close();

	}
}
