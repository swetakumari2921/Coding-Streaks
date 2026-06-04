package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex166 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter size of ArrayList:");
		int n = sc.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter target:");
		int target = sc.nextInt();

		int first = list.get(0);
		int second = list.get(1);
		int minDiff = Math.abs((first + second) - target);

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {

				int sum = list.get(i) + list.get(j);
				int diff = Math.abs(sum - target);

				if (diff < minDiff) {
					minDiff = diff;
					first = list.get(i);
					second = list.get(j);
				}
			}
		}

		System.out.println("Closest Pair: " + first + " and " + second);
		System.out.println("Pair Sum = " + (first + second));
	}
}
