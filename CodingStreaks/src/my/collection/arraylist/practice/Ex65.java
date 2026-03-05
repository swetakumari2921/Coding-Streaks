package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 0)
				pos.add(x);
			else
				neg.add(x);
		}

		ArrayList<Integer> result = new ArrayList<>();

		int i = 0, j = 0;
		boolean turnPositive = true;

		while (i < pos.size() || j < neg.size()) {
			if (turnPositive && i < pos.size()) {
				result.add(pos.get(i++));
			} else if (!turnPositive && j < neg.size()) {
				result.add(neg.get(j++));
			}
			turnPositive = !turnPositive;
		}

		System.out.println("Rearranged array:");
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
}