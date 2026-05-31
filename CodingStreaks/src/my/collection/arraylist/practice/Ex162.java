package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of ArrayLists: ");
		int k = sc.nextInt();

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		for (int i = 0; i < k; i++) {

			System.out.print("Enter size of ArrayList " + (i + 1) + ": ");
			int n = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();

			System.out.println("Enter elements:");
			for (int j = 0; j < n; j++) {
				list.add(sc.nextInt());
			}

			lists.add(list);
		}

		ArrayList<Integer> result = new ArrayList<>();

		ArrayList<Integer> first = lists.get(0);

		for (int i = 0; i < first.size(); i++) {

			int current = first.get(i);
			boolean foundInAll = true;

			for (int j = 1; j < k; j++) {

				boolean found = false;

				for (int m = 0; m < lists.get(j).size(); m++) {
					if (lists.get(j).get(m) == current) {
						found = true;
						break;
					}
				}

				if (!found) {
					foundInAll = false;
					break;
				}
			}

			if (foundInAll && !result.contains(current)) {
				result.add(current);
			}
		}

		System.out.println("Common Elements: " + result);

		sc.close();
	}
}
