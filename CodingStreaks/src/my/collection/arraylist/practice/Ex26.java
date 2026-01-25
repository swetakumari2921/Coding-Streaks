package my.collection.arraylist.practice;

import java.util.*;

class User {
	String name;
	ArrayList<Integer> overdueDays = new ArrayList<>();
	int totalFee = 0;

	User(String name) {
		this.name = name;
	}

	void calculateFee() {
		totalFee = 0;
		for (int days : overdueDays) {
			totalFee += days; // ₹1 per day
		}
	}
}

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<>();

		System.out.println("===== Library Book Borrowing System =====");
		System.out.print("Enter number of users: ");
		int n = sc.nextInt();

		// Input users and borrowed books
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter user name:");
			String name = sc.next();

			User user = new User(name);

			System.out.println("Enter number of borrowed books:");
			int books = sc.nextInt();

			System.out.println("Enter overdue days for each book:");
			for (int j = 0; j < books; j++) {
				user.overdueDays.add(sc.nextInt());
			}

			users.add(user);
		}

		// Returned books
		System.out.println("\nEnter number of returned books:");
		int returned = sc.nextInt();

		for (int i = 0; i < returned; i++) {
			System.out.println("Enter user name who returned a book:");
			String uname = sc.next();

			System.out.println("Enter overdue days of returned book:");
			int day = sc.nextInt();

			for (User u : users) {
				if (u.name.equals(uname)) {
					u.overdueDays.remove(Integer.valueOf(day));
					System.out.println("Book returned successfully!");
					break;
				}
			}
		}

		// Calculate fees
		System.out.println("\nCalculating total late fees...");
		for (User u : users) {
			u.calculateFee();
		}

		// Sort users by late fee (descending)
		users.sort((u1, u2) -> u2.totalFee - u1.totalFee);

		// Final output
		System.out.println("\n===== Final Late Fee Summary =====");
		for (User u : users) {
			System.out.println(u.name);
			System.out.println("₹" + u.totalFee);
		}

		sc.close();
	}
}
