package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter start position m and end position n to reverse:");
		int m = sc.nextInt();
		int p = sc.nextInt();

		if (m < 1 || p > n || m > p) {
			System.out.println("Invalid positions");
			return;
		}

		int left = m - 1;
		int right = p - 1;
		while (left < right) {
			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}

		System.out.println("Linked list after reversing sublist:");
		for (int val : list) {
			System.out.print(val + " ");
		}
	}
}
