package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of songs:");
		int n = sc.nextInt();
		sc.nextLine();

		LinkedList<String> playlist = new LinkedList<>();

		System.out.println("Enter song names:");
		for (int i = 0; i < n; i++) {
			playlist.add(sc.nextLine());
		}

		System.out.println("Reversed Playlist:");
		for (int i = playlist.size() - 1; i >= 0; i--) {
			System.out.print(playlist.get(i) + " ");
		}

		sc.close();
	}

}
