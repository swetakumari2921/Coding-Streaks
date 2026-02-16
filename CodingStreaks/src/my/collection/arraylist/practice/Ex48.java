package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter linked list values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter partition value:");
		int partitionValue = sc.nextInt();

		ArrayList<Integer> less = new ArrayList<>();
		ArrayList<Integer> greater = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int val = list.get(i);
			if (val < partitionValue) {
				less.add(val);
			} else {
				greater.add(val);
			}
		}

		System.out.println("Modified linked list after partition:");
		for (int x : less) {
			System.out.print(x + " ");
		}
		for (int x : greater) {
			System.out.print(x + " ");
		}
	}
}
