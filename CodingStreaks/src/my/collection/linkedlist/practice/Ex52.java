package my.collection.linkedlist.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of songs:");
		int n = sc.nextInt();
		sc.nextLine();

		LinkedList<String> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter song name:");
			String song = sc.nextLine();
			list.addFirst(song);
		}

		System.out.println("Playlist:");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
