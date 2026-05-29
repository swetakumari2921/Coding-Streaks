package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex160 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter size of ArrayList:");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter value of k:");
		int k = sc.nextInt();

		int totalSum = 0;

		for (int i = 0; i < list.size(); i++) {
			totalSum += list.get(i);
		}

		if (totalSum % k != 0) {
			System.out.println("Cannot split into equal sum segments");
			return;
		}

		int target = totalSum / k;

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		ArrayList<Integer> current = new ArrayList<>();
		int currentSum = 0;

		for (int i = 0; i < list.size(); i++) {

			current.add(list.get(i));
			currentSum += list.get(i);

			if (currentSum == target) {

				result.add(current);

				current = new ArrayList<>();
				currentSum = 0;
			} else if (currentSum > target) {
				System.out.println("Cannot split into equal sum segments");
				return;
			}
		}

		if (result.size() == k) {

			System.out.println("Segments are:");

			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		} else {
			System.out.println("Cannot split into equal sum segments");
		}
	}
}
