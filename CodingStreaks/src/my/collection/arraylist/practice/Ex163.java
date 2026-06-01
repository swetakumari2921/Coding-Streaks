package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of ArrayLists: ");
		int k = sc.nextInt();

		ArrayList<Integer>[] lists = new ArrayList[k];

		for (int i = 0; i < k; i++) {
			lists[i] = new ArrayList<>();

			System.out.print("Enter size of ArrayList " + (i + 1) + ": ");
			int size = sc.nextInt();

			System.out.println("Enter elements in sorted order:");
			for (int j = 0; j < size; j++) {
				lists[i].add(sc.nextInt());
			}
		}

		ArrayList<Integer> result = new ArrayList<>();

		int[] index = new int[k];

		while (true) {
			int minValue = Integer.MAX_VALUE;
			int minList = -1;

			for (int i = 0; i < k; i++) {
				if (index[i] < lists[i].size()) {
					int value = lists[i].get(index[i]);

					if (value < minValue) {
						minValue = value;
						minList = i;
					}
				}
			}

			if (minList == -1) {
				break;
			}

			result.add(minValue);
			index[minList]++;
		}

		System.out.println("Merged ArrayList:");
		System.out.println(result);
	}
}
