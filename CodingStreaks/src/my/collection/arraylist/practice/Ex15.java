package my.collection.arraylist.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> seats = new ArrayList<>();

		System.out.println("Welcome to Movie Ticket Reservation System");
		System.out.print("Enter number of bookings: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter customer name and seat number:");
			String name = sc.next();
			int seat = sc.nextInt();

			boolean booked = false;

			for (int j = 0; j < seats.size(); j++) {
				if (seats.get(j) == seat) {
					booked = true;
					break;
				}
			}

			if (booked) {
				System.out.println("Seat " + seat + " is already booked. Booking rejected.");
			} else {
				names.add(name);
				seats.add(seat);
				System.out.println("Booking confirmed for " + name + " (Seat " + seat + ")");
			}
		}

		System.out.print("\nEnter number of cancellations: ");
		int cancelCount = sc.nextInt();

		for (int i = 0; i < cancelCount; i++) {
			System.out.print("Enter customer name to cancel booking: ");
			String cancelName = sc.next();

			boolean found = false;

			for (int j = 0; j < names.size(); j++) {
				if (names.get(j).equals(cancelName)) {
					names.remove(j);
					seats.remove(j);
					found = true;
					System.out.println("Booking cancelled for " + cancelName);
					break;
				}
			}

			if (!found) {
				System.out.println("No booking found for " + cancelName);
			}
		}

		System.out.println("\nFinal Seating Arrangement:");
		if (names.isEmpty()) {
			System.out.println("No seats booked.");
		} else {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i) + " - Seat " + seats.get(i));
			}
		}

		System.out.println("\nThank you for using the Movie Ticket Reservation System!");

		sc.close();
	}
}
