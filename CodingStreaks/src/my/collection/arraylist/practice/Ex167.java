package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex167 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		long maxProduct = Long.MIN_VALUE;
		int first = 0, second = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {

				long product = (long) list.get(i) * list.get(j);

				if (product > maxProduct) {
					maxProduct = product;
					first = list.get(i);
					second = list.get(j);
				}
			}
		}

		System.out.println("Maximum Product = " + maxProduct);
		System.out.println("Pair = (" + first + ", " + second + ")");
	}
}
