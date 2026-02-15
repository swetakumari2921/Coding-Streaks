package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex42 {

	public static void reverseAlternateK(LinkedList<Integer> list, int k) {
		int n = list.size();
		boolean reverse = true;

		for (int i = 0; i < n; i += k) {
			if (reverse) {
				int left = i;
				int right = Math.min(i + k - 1, n - 1);

				while (left < right) {
					int temp = list.get(left);
					list.set(left, list.get(right));
					list.set(right, temp);
					left++;
					right--;
				}
			}
			reverse = !reverse;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		System.out.println("Enter the values of nodes:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter value of K:");
		int k = sc.nextInt();

		reverseAlternateK(list, k);

		System.out.println("Linked List after reversing alternate K nodes:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
