package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the node values:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 != 0)
				odd.add(list.get(i));
			else
				even.add(list.get(i));
		}

		odd.addAll(even);

		System.out.println("Rearranged linked list:");
		for (int i = 0; i < odd.size(); i++) {
			System.out.print(odd.get(i));
		}
	}
}
