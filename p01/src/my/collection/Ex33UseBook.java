package my.collection;

import java.util.Set;
import java.util.TreeSet;

public class Ex33UseBook {
	public static void main(String[] args) {
		Set<Ex33Book> bookSet = new TreeSet<>();
		Ex33Book b1 = new Ex33Book("Mastering Java", "Lafore", 560.56);
		Ex33Book b2 = new Ex33Book("C in depth", "Gagan", 590.34);
		Ex33Book b3 = new Ex33Book("Python Project", "Shrivastva", 455.78);
		Ex33Book b4 = new Ex33Book("Java Project", "Ganga", 590.34);

		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);

		System.out.println("Total books added: " + bookSet.size());
		System.out.println("Traversing bookSet...");
		for (Ex33Book b : bookSet) {
			System.out.println(b);
		}
	}
}
