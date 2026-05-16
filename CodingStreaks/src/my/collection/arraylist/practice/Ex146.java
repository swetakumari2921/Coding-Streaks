package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex146 {

	public static void replaceNegatives(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < 0) {
				list.set(i, 0);
			}
		}

		System.out.println(list);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		replaceNegatives(list);

		sc.close();
	}
}
