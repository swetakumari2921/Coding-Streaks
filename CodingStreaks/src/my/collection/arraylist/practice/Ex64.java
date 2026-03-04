package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		if (list.size() == 0) {
			System.out.println("Longest consecutive sequence length: 0");
			return;
		}

		Collections.sort(list);

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 1; i < list.size(); i++) {

			if (list.get(i).equals(list.get(i - 1))) {
				continue; // ignore duplicate
			} else if (list.get(i) == list.get(i - 1) + 1) {
				currentLength++;
			} else {
				maxLength = Math.max(maxLength, currentLength);
				currentLength = 1;
			}
		}

		maxLength = Math.max(maxLength, currentLength);

		System.out.println("Longest consecutive sequence length: " + maxLength);
	}
}
