package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> parkingLot = new ArrayList<>();

		System.out.print("Enter number of cars entering: ");
		int enterCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < enterCount; i++) {
			System.out.print("Enter car registration number: ");
			String regNo = sc.nextLine();
			parkingLot.add(regNo);
		}

		System.out.print("Enter number of cars leaving: ");
		int leaveCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < leaveCount; i++) {
			System.out.print("Enter car registration number leaving: ");
			String regNo = sc.nextLine();
			parkingLot.remove(regNo);
		}

		System.out.println("Current cars in parking lot: " + String.join(", ", parkingLot));
		sc.close();
	}
}
