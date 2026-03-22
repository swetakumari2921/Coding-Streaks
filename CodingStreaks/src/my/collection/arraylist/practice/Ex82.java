package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex82 {

	public static void reverse(ArrayList<Integer> list) {
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);

			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Original ArrayList: " + list);

		reverse(list);

		System.out.println("Reversed ArrayList: " + list);
	}
}
