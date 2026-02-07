package my.collection.arraylist.practice;

import java.util.*;

class Node7 {
	int data;
	Node7 next;

	Node7(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Ex39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter linked list elements (0,1,2 without spaces): ");
		String input = sc.nextLine();

		Node7 head = new Node7(input.charAt(0) - '0');
		Node7 current = head;
		for (int i = 1; i < n; i++) {
			current.next = new Node7(input.charAt(i) - '0');
			current = current.next;
		}

		List<Integer> list = new ArrayList<>();
		current = head;
		while (current != null) {
			list.add(current.data);
			current = current.next;
		}

		Collections.sort(list);

		System.out.print("Sorted Linked List: ");
		for (int num : list)
			System.out.print(num);
	}
}
