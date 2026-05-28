package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter size:");
		int n = sc.nextInt();

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int totalSum = 0;

		for (int i = 0; i < list.size(); i++) {
			totalSum += list.get(i);
		}

		int leftSum = 0;
		boolean found = false;

		for (int i = 0; i < list.size() - 1; i++) {

			leftSum += list.get(i);

			int rightSum = totalSum - leftSum;

			if (leftSum == rightSum) {

				found = true;

				System.out.println("Partition found");

				System.out.print("First Part: ");
				for (int j = 0; j <= i; j++) {
					System.out.print(list.get(j) + " ");
				}

				System.out.println();

				System.out.print("Second Part: ");
				for (int j = i + 1; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}

				break;
			}
		}

		if (!found) {
			System.out.println("Equal sum partition not possible");
		}
	}
}
