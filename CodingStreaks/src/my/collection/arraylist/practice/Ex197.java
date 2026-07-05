package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex197 {

	static void majorityElement(ArrayList<Integer> list) {
		int n = list.size();
		boolean found = false;

		for (int i = 0; i < n; i++) {
			int count = 0;
			boolean alreadyPrinted = false;

			for (int k = 0; k < i; k++) {
				if (list.get(k).equals(list.get(i))) {
					alreadyPrinted = true;
					break;
				}
			}

			if (alreadyPrinted)
				continue;

			for (int j = 0; j < n; j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			if (count > n / 4) {
				System.out.print(list.get(i) + " ");
				found = true;
			}
		}

		if (!found) {
			System.out.println("No majority element");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Majority element(s) (> n/4): ");
		majorityElement(list);

		sc.close();
	}
}
