package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex63 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		ArrayList<Integer> leaders = new ArrayList<>();

		int maxFromRight = list.get(n - 1);
		leaders.add(maxFromRight);

		for (int i = n - 2; i >= 0; i--) {
			if (list.get(i) > maxFromRight) {
				maxFromRight = list.get(i);
				leaders.add(maxFromRight);
			}
		}

		System.out.println("Leaders are:");
		for (int i = leaders.size() - 1; i >= 0; i--) {
			System.out.print(leaders.get(i) + " ");
		}
	}
}
