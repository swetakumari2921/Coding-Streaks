package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex169 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of list: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter value of K: ");
		int k = sc.nextInt();

		int count = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if ((list.get(i) + list.get(j)) % k == 0) {
					count++;
				}
			}
		}

		System.out.println("Number of pairs = " + count);
	}
}
