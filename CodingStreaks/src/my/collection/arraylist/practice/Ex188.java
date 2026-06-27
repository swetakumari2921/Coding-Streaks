package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex188 {

	static int findFloor(ArrayList<Integer> list, int key) {
		int low = 0;
		int high = list.size() - 1;
		int floor = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (list.get(mid) == key) {
				return list.get(mid);
			} else if (list.get(mid) < key) {
				floor = list.get(mid);
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return floor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		System.out.println("Enter sorted elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter number of queries: ");
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			System.out.print("Enter key: ");
			int key = sc.nextInt();

			int ans = findFloor(list, key);

			if (ans == -1)
				System.out.println("Floor does not exist");
			else
				System.out.println("Floor = " + ans);
		}

		sc.close();
	}
}
