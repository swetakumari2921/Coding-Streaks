package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter k:");
		int k = sc.nextInt();

		k = k % n;

		for (int i = 0; i < k; i++) {
			int temp = list.remove(n - 1);
			list.add(0, temp);
		}

		System.out.println("Left Rotation:");
		System.out.println(list);

		for (int i = 0; i < k; i++) {
			int temp = list.remove(0);
			list.add(temp);
		}

		System.out.println("Right Rotation:");
		System.out.println(list);
	}
}

