package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter k:");
		int k = sc.nextInt();

		LinkedList<Integer> result = new LinkedList<>();

		while (list.size() > 0) {
			LinkedList<Integer> temp = new LinkedList<>();
			int count = 0;
			while (count < k && list.size() > 0) {
				temp.add(list.removeFirst());
				count++;
			}
			while (temp.size() > 0) {
				result.add(temp.removeLast());
			}
		}

		System.out.println(result);
	}
}
