package my.collection.arraylist.practice;

import java.util.*;

	class Showtime implements Comparable<Showtime> {
	    String name;
	    int tickets;
	    double basePrice;
	    double dynamicPrice;

	    Showtime(String name, int tickets, double basePrice) {
	        this.name = name;
	        this.tickets = tickets;
	        this.basePrice = basePrice;
	        calculatePrice();
	    }

	    void calculatePrice() {
	        int slabs = tickets / 10;
	        dynamicPrice = basePrice * Math.pow(1.05, slabs);
	    }

	    void cancelTickets(int count) {
	        System.out.println("Cancelling " + count + " tickets for " + name);
	        tickets -= count;
	        if (tickets < 0) tickets = 0;
	        calculatePrice();
	    }

	    @Override
	    public int compareTo(Showtime s) {
	        return Double.compare(s.dynamicPrice, this.dynamicPrice);
	    }
	}

	public class Ex28MovieBookingSystem {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Showtime> showtimes = new ArrayList<>();

	        System.out.println("===== Movie Booking System Started =====");

	        System.out.print("Enter number of showtimes: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Showtime " + (i + 1));
	            System.out.print("Showtime Name: ");
	            String name = sc.next();
	            System.out.print("Tickets Booked: ");
	            int tickets = sc.nextInt();
	            System.out.print("Base Ticket Price: ");
	            double price = sc.nextDouble();

	            showtimes.add(new Showtime(name, tickets, price));
	            System.out.println("Showtime added successfully!");
	        }

	        System.out.print("\nEnter number of cancellation operations: ");
	        int cancelOps = sc.nextInt();

	        for (int i = 0; i < cancelOps; i++) {
	            System.out.println("\nEnter cancellation details:");
	            System.out.print("Showtime Name: ");
	            String show = sc.next();
	            System.out.print("Tickets to cancel: ");
	            int cancelTickets = sc.nextInt();

	            boolean found = false;
	            for (Showtime s : showtimes) {
	                if (s.name.equals(show)) {
	                    s.cancelTickets(cancelTickets);
	                    found = true;
	                }
	            }

	            if (!found) {
	                System.out.println("Showtime not found!");
	            }
	        }

	        Collections.sort(showtimes);

	        System.out.println("\n===== Final Booking Details (Sorted by Price) =====");
	        for (Showtime s : showtimes) {
	            System.out.println(
	                s.name + " | Tickets: " + s.tickets + " | Price: " + Math.round(s.dynamicPrice)
	            );
	        }

	        System.out.println("===== Movie Booking System Ended =====");
	        sc.close();
	    }
	}

