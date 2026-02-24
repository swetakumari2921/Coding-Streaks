package my.collection.linkedlist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of fruits:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> list = new ArrayList<>();

		System.out.println("Enter fruit names:");
		for (int i = 0; i < n; i++) {
			String fruit = sc.nextLine();
			list.add(fruit);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
