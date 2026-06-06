package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex168 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int first = list.get(0);
		int second = list.get(1);
		int minProduct = first * second;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {

				int product = list.get(i) * list.get(j);

				if (product < minProduct) {
					minProduct = product;
					first = list.get(i);
					second = list.get(j);
				}
			}
		}

		System.out.println("Pair: " + first + " and " + second);
		System.out.println("Minimum Product: " + minProduct);
	}
}
