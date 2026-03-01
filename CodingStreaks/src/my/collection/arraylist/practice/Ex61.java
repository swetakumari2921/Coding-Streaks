package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of songs:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> playlist = new ArrayList<>();

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
